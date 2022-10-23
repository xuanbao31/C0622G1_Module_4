package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICategoryService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IBlogService blogService;

    @GetMapping("/category")
    public String showList(Model model){
        List<Category>categoryList=categoryService.findAll();
        model.addAttribute("category",categoryList);
        return "/category/list";
    }
    @GetMapping("/createCategory")
    public String showCreateForm(Model model){
        model.addAttribute("categoryList", categoryService.findAll());
        return "/category/create";
    }
    @PostMapping("/createCategory")
    public String create(@ModelAttribute Category category){
        categoryService.save(category);
        return "redirect:/category";
    }
    @GetMapping("/deleteCategory/{id}")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "category/delete";
    }
    @PostMapping("deleteCategory")
    public String delete(Category category){
        categoryService.remove(category.getId());
        return "redirect:/category";
    }
}
