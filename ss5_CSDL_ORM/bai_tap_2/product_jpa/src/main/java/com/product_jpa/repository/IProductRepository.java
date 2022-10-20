package com.product_jpa.repository;

import com.product_jpa.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    Product findById(int id);

    void delete(int id);

    public List<Product> findByName(String name);
}
