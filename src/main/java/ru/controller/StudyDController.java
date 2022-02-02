package ru.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyDController {

    @Value("${example.environment.variable}")
    private String val;

    @GetMapping("")
    public String showHello(){
        System.out.println("!!!!!!!!!!" + val + "!!!!!!!!!");
        return "hello";
    }
}
