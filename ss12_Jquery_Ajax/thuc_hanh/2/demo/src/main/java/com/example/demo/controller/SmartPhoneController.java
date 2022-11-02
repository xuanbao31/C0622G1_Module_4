package com.example.demo.controller;

import com.example.demo.model.SmartPhone;
import com.example.demo.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/smartphones")

public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartPhoneService;
    @GetMapping
    public ResponseEntity<List<SmartPhone>> showPhone(){
        return new ResponseEntity<>(smartPhoneService.findAll(), HttpStatus.OK);

    }
    @GetMapping("/list")
 public String showList(Model model){
        List<SmartPhone>smartPhoneList=smartPhoneService.findAll();
        model.addAttribute("smartPhoneList",smartPhoneList);
        return "/list";
    }
}