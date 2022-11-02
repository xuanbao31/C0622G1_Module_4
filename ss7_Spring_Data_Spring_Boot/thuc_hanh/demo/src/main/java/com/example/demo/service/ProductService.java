package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }


    @Override
    public void remove(int id) {
        productRepository.deleteById(id);
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
