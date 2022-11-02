package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Order;
import com.example.demo.service.IBookService;
import com.example.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

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
        int borrowCode = ((int) (Math.random() * 1000));
        Order order = new Order(borrowCode, book);
        orderService.save(order);
        redirectAttributes.addFlashAttribute("success", order.getBorrowCode());
        return "redirect:/";
    }

    @GetMapping("{id}/return")
    private String returnBook(@PathVariable int id, Model model) {
        model.addAttribute("idBook", id);

        return "/viewBack";
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam Integer borrowCode, @RequestParam Integer idBook, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(idBook);

        Set<Order> orders = book.getOrders();
        List<Order> realOrders = new ArrayList<>();

        for (Order x : orders) {
            realOrders.add(x);
        }

        Integer borrowCodee = realOrders.get(0).getBorrowCode();

        if (borrowCodee.equals(borrowCode)) {
            Order order = realOrders.get(0);
            order.setBorrowCode(0);
            orderService.save(order);
            book.setCount(book.getCount() + 1);
            bookService.save(book);
            redirectAttributes.addFlashAttribute("mess", "Ban Da Tra Sach Thanh Cong");
            return "redirect:/";
        }
        return "error";
    }

}
