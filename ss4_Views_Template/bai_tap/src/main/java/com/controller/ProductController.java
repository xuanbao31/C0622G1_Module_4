package com.controller;

import com.model.Product;
import com.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("list", productList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";


    }
    @PostMapping("/save")
    public String save( Product product){
           product.setId((int)(Math.random()*1000));
           productService.save(product);
           return "redirect:/";
    }
}
