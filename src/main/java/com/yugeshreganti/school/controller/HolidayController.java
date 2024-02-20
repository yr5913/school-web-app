package com.yugeshreganti.school.controller;

import com.yugeshreganti.school.model.Holiday;
import com.yugeshreganti.school.respository.HolidaysRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
public class HolidayController {
    @Autowired
    private HolidaysRepository holidaysRepository;

    @GetMapping(value = {"/holidays/{display}", "/holidays", "/holidays/"})
    public String displayHolidays(@PathVariable(required = false) String display, Model model) {

        if (display == null || display.equals("all")) {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        } else if (display.equals("festival")) {
            model.addAttribute("festival", true);
        } else if (display.equals("federal")) {
            model.addAttribute("federal", true);
        } else {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        }
        List<Holiday> holidays = holidaysRepository.findAllHolidays();
        Holiday.Type[] types = Holiday.Type.values();
        for (Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }


}
