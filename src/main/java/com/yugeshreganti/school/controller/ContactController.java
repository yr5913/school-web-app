package com.yugeshreganti.school.controller;

import com.yugeshreganti.school.model.Contact;
import com.yugeshreganti.school.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);
    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }


//    @PostMapping(value = "/saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject
//            , @RequestParam String message) {
//        log.info("Name is: " + name);
//        log.info("Mobile Number is: " + mobileNum);
//        log.info("Email Address: " + email);
//        log.info("Subject: " + subject);
//        log.info("Message: " + message);
//        return new ModelAndView("redirect:/contact");
//
//    }


    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessage(contact);
        return new ModelAndView("redirect:/contact");

    }
}
