package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public String showListCustomer(Model model) {
        List<Product> customerList = productService.findAll();
        model.addAttribute("list", customerList);
        return "/list";
    }

    @GetMapping("/create")
    public  String showFormCreate(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Product product ){
        productService.save(product);
        return "redirect:/";
    }


}
