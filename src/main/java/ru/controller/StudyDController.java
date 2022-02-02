package ru.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyDController {

    @Value("${example.environment.variable}")
    private Integer environmentVar;

    @GetMapping("")
    public String showHello(Model model){
        model.addAttribute("environmentVar", environmentVar);
        return "hello";
    }
}
