package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.service.ServiceImpl;

@Controller

public class EmailController {
//    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    private static Pattern pattern;
//    private Matcher matcher;

    @Autowired
    ServiceImpl serviceImpl;

    @GetMapping("/")
    String getIndex() {
        return "/index";
    }

    @PostMapping("/validate")
    public ModelAndView Email(@RequestParam String email){
        String result = serviceImpl.checkEmail(email);
        return new ModelAndView("/success","result",result);
    }


//    public EmailController(){
//        pattern=Pattern.compile(EMAIL_REGEX);
//    }

//    @PostMapping("/validate")
//    String validateEmail(@RequestParam ("email") String email, Model model){
//        boolean isValid =this.validate(email);
//        if (!isValid){
//            model.addAttribute("message","Email is invalid");
//            return "/index";
//        }
//        model.addAttribute("email",email);
//        return "/success";
//    }
//
//    private boolean validate(String regex) {
//        matcher=pattern.matcher(regex);
//        return matcher.matches();
//    }
}
