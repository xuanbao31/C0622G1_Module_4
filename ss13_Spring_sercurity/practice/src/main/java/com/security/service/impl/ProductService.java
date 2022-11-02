package com.security.service.impl;

import com.security.model.Product;
import com.security.repository.IProductRepository;
import com.security.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;


    @Override
    public Page<Product> findAllByNameContaining(Pageable pageable, String nameSearch) {
        return productRepository.findAllByNameContaining(pageable,nameSearch);
    }
}
