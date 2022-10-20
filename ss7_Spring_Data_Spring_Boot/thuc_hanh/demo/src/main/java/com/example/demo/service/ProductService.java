package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

//    @Override
//    public List<Customer> findById(int id) {
//        return customerRepository.findById(id);
//    }
//
//    @Override
//    public void remove(int id) {
//        customerRepository.r(id);
//    }
}
