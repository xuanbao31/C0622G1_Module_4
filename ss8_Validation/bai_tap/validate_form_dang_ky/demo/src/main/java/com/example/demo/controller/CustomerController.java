package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer")
    public String showList(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("list", customerList);
        return "/index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("newCustomer", new Customer());
        return "/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("newCustomer") @Validated Customer customer,
                       BindingResult bindingResult,Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }
        else {
            customerService.save(customer);

            model.addAttribute("list", customerService.findAll());

            return "/index";
        }


    }
}
