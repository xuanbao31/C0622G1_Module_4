package com.service;

import com.model.Email;

import java.util.List;

public interface IEmailService {
    List<String> language();
    List<Integer> pageSize();
    List<String> spamsFilter();


}
