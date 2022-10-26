package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Order;
import com.example.demo.service.IBookService;
import com.example.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOrderService orderService;

    @GetMapping("/")
    private String showAll(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("book", bookList);
        return "/index";
    }

    @GetMapping("{id}/borrow")
    private String borrowedBooks(@PathVariable int id, Model model) throws Exception {

        Book book = bookService.findById(id);
        if (book.getCount() == 0) {
            throw new Exception();
        }
        model.addAttribute("book", book);
        return "/view";
    }

    @PostMapping("/save")
    private String saveBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        book.setCount(book.getCount() - 1);
        bookService.save(book);
        int borrowCode=((int) (Math.random()*1000));
        Order order=new Order(borrowCode,book);
        orderService.save(order);
        redirectAttributes.addFlashAttribute("success" , order.getBorrowCode());
        return "redirect:/";
    }

}
