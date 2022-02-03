package ru.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.entity.SavedEntity;
import ru.service.StudyService;

@Controller
public class StudyDController {

    @Value("${example.environment.variable}")
    private Integer environmentVar;

    private final StudyService studyService;

    public StudyDController(StudyService studyService) {
        this.studyService = studyService;
    }

    @GetMapping("")
    public String showHello(Model model){
        SavedEntity savedEntity = studyService.save(new SavedEntity("Object to database"));
        model.addAttribute("environmentVar", environmentVar);
        model.addAttribute("savedEntity", savedEntity);
        return "hello";
    }
}
