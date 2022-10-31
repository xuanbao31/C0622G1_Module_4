package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    List<Category> findAll();
    void save(Category category);
    void  update(Category category);
    void remove(int id);
//    Category findById(int id);
    Category findById(int id);
}
