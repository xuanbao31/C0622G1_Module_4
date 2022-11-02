package com.example.demo.service;

import com.example.demo.model.SmartPhone;
import com.example.demo.repository.ISmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private ISmartPhoneRepository smartPhoneRepository;

    @Override
    public List<SmartPhone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public void save(SmartPhone smartPhone) {
        smartPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
         smartPhoneRepository.deleteById(id);
    }
}
