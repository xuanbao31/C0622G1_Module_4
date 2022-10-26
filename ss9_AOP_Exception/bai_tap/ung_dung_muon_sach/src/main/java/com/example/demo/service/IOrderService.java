package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order>findAll();
    Order findById(int id);
    void delete(int id);
    void save (Order order);
}
