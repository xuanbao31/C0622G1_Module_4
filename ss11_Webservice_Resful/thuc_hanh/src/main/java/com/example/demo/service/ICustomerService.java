package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer>findAll();
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void remove(Long id);

}
