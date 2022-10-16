package com.service;

import org.springframework.stereotype.Service;
import com.validation.EmailRegex;

@Service
public class ServiceImpl implements IEmailService {
    @Override
    public String checkEmail(String emailCheck) {
        String result = "Email khong hop le";

        if (emailCheck.matches(EmailRegex.REGEX_EMAIL)){
            result="Email hop le";
        }

        return result;
    }
}
