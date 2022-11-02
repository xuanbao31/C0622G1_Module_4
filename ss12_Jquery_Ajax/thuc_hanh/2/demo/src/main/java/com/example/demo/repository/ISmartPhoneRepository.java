package com.example.demo.repository;

import com.example.demo.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISmartPhoneRepository extends JpaRepository<SmartPhone,Long> {

}
