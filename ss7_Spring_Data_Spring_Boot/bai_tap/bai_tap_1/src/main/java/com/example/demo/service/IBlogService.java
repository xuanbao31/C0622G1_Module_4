package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save (Blog blog);
  Blog findById(int id);
    void remove(int id);
}
