package com.yugeshreganti.school.controller;


import com.yugeshreganti.school.model.EazyClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @RequestMapping("/displayClasses")
    public ModelAndView displayMessages(Model model) {
        ModelAndView modelAndView = new ModelAndView("classes.html");
        modelAndView.addObject("eazyClass", new EazyClass());
        return modelAndView;
    }
}
