package com.product_jpa.service;

import com.product_jpa.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    Product findById(int id);

    void delete(int id);

    public List<Product> findByName(String name);
}
