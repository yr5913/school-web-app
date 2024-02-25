package com.yugeshreganti.school.controller;

import com.yugeshreganti.school.model.Address;
import com.yugeshreganti.school.model.Person;
import com.yugeshreganti.school.model.Profile;
import com.yugeshreganti.school.repository.PersonRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ProfileController {



    @Autowired
    PersonRepository personRepository;


    @RequestMapping("/displayProfile")
    public ModelAndView displayContactPage(Model model, HttpSession httpSession) {
        Profile profile = new Profile();
        Person person = (Person) httpSession.getAttribute("loggedInPerson");
        profile.setName(person.getName());
        profile.setMobileNumber(person.getMobileNumber());
        profile.setEmail(person.getEmail());
        if((person.getAddress() != null) && (person.getAddress().getAddressId() > 0)){
            BeanUtils.copyProperties(person.getAddress(), profile);
        }
        ModelAndView modelAndView = new ModelAndView("profile.html");
        modelAndView.addObject("profile", profile);
        return modelAndView;
    }

    @PostMapping(value = "/updateProfile")
    public String updateProfile(@Valid @ModelAttribute("profile") Profile profile, Errors errors,
                                HttpSession session)
    {
        if(errors.hasErrors()){
            return "profile.html";
        }
        Person person = (Person) session.getAttribute("loggedInPerson");
        person.setName(profile.getName());
        person.setEmail(profile.getEmail());
        person.setMobileNumber(profile.getMobileNumber());
        if(person.getAddress() ==null || !(person.getAddress().getAddressId()>0)){
            person.setAddress(new Address());
        }
        BeanUtils.copyProperties(profile, person.getAddress());
        Person savedPerson = personRepository.save(person);
        session.setAttribute("loggedInPerson", savedPerson);
        return "redirect:/displayProfile";
    }
}
