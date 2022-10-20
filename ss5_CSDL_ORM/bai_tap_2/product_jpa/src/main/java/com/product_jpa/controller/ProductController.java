package com.product_jpa.controller;

import com.product_jpa.model.Product;
import com.product_jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Product product){
        productService.delete(product.getId());
        return "redirect:/";

    }
    @GetMapping("{id}/update")
    private String update(@PathVariable int id, Model model){
        model.addAttribute("product",new Product() );
        return "/update";
    }
    @PostMapping("/update")
    private String update(Product product){
        productService.update(product);
        return "redirect:/";
    }
}
