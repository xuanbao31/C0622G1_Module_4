package com.service;

import com.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IEmailRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmailServiceImpl implements IEmailService {
@Autowired
private IEmailRepository emailRepository;

    @Override
    public List<String> language() {
        return emailRepository.language();
    }

    @Override
    public List<Integer> pageSize() {
        return emailRepository.pageSize();
    }

    @Override
    public List<String> spamsFilter() {
        return emailRepository.spamsFilter();
    }
}
