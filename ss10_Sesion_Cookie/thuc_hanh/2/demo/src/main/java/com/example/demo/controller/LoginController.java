package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;

@Controller
@SessionAttributes("user")
public class LoginController {
    @ModelAttribute("user")
    public User setUpUserForm(){
        return new User();
    }
    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser",defaultValue = "")String setUser, Model model){
        Cookie cookie=new Cookie("setUser",setUser);
        model.addAttribute("cookieValue",cookie);
        return "/login";
    }

}
