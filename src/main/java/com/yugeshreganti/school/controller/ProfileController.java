package com.yugeshreganti.school.controller;

import com.yugeshreganti.school.model.Person;
import com.yugeshreganti.school.model.Profile;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ProfileController {


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
}
