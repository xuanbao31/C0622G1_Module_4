package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("list", blogList);
        return "/list";
    }

    @GetMapping("/create")
    public String showFormAdd(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String addToList(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        Optional<Blog> blogDelete = blogService.findById(id);
        if (blogDelete.isPresent()) {
            model.addAttribute("blogDelete", blogDelete.get());
            return "/delete";
        } else {
            return "/error";
        }

    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/";
    }
}
