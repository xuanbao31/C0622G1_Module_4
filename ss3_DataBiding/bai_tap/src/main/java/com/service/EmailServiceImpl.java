package com.service;

import com.model.Email;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailServiceImpl implements IEmailService {



    @Override
    public List<String> findAllLanguages() {
        return null;
    }

    @Override
    public List<Integer> findAllPageSize() {
        return null;
    }

    @Override
    public List<Email> findAllEmail() {
        return null;
    }


    @Override
    public void update(Email email) {

    }

    @Override
    public Email findById(int id) {
        return null;
    }
}
