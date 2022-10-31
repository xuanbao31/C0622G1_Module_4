package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Page<Blog> findByName(Pageable pageable, String name);
    void save(Blog blog);
    void delete(int id);
    void edit (Blog blog);
    Optional<Blog> findById(int id);
    List<Blog>findAll();
}
