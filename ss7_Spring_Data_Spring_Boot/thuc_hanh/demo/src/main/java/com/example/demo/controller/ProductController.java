package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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

}
