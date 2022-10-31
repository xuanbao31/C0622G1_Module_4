package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomer() {
        List<Customer> customerList = customerService.findAll();
        if (customerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addCustomer(@RequestBody CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        Customer customer = new Customer();
        // tạo đối tượng customer để lưu
        Optional<Customer> currentCustomer = customerService.findById(id);
        if (!currentCustomer.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerDto.setFirstName(currentCustomer.get().getFirstName());
        customerDto.setLastName(currentCustomer.get().getLastName());
        BeanUtils.copyProperties(customerDto, customer);
        // đẩy Dto sang Model
        customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findId(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        if (!customer.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer.get(), HttpStatus.OK);

    }

}
