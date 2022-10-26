package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/")
    private String showAll(Model model){
        List<Book> bookList= bookService.findAll();
        model.addAttribute("book",bookList);
        return "/index";
    }
    @GetMapping("{id}/borrow")
    private String borrowedBooks(@PathVariable int id, Model model){
        Integer otp = bookService.getOtp();
        Book book=bookService.findById(id);
        model.addAttribute("book",book);
        model.addAttribute("otp",otp);
        return"/view";
    }

}
