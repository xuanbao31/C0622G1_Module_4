package com.translate.controller;

import com.translate.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class Dictionary {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/")
    public String dictionary() {
        return "/index";
    }


    @PostMapping("/dictionary")
    public String change(String dictionary, Model model) {
        String result = dictionaryService.change(dictionary);
        model.addAttribute("result1", result);
        return "/index";
    }
}
