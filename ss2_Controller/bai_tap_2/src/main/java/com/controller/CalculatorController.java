package com.controller;

import com.service.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.service.ICalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorServiceImpl calculatorService;

    @GetMapping("/")
    public String Calculator() {
        return "/index";
    }

    @GetMapping("calculator")
    public ModelAndView resultCalculator(@RequestParam String number1, String number2, String operator) {
        return new ModelAndView("index", "result", calculatorService.calculator(number1, number2, operator));

    }
}
