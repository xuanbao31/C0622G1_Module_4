package com.example.demo.service;

import com.example.demo.model.SmartPhone;

import java.util.List;
import java.util.Optional;

public interface ISmartPhoneService {
    List<SmartPhone> findAll();
    Optional<SmartPhone>findById(Long id);
    void save(SmartPhone smartPhone);
    void remove (Long id);
}
