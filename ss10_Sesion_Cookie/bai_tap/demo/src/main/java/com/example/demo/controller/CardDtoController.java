package com.example.demo.controller;

import com.example.demo.dto.CardDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class CardDtoController {
    @GetMapping
    public ModelAndView showCart(@SessionAttribute(name = "cart", required = false) CardDto cart){
        return new ModelAndView("cart/list","cart", cart);
    }
}
