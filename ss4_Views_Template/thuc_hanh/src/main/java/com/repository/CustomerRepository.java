package com.repository;

import com.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class CustomerRepository implements ICustomerRepository {
    private static Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "Bao", "Bao@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Huy", "Huy@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3, "Minh", "Minh@codegym.vn", "Saigon"));
        customerMap.put(4, new Customer(4, "Khanh", "Khanh@codegym.vn", "Beijin"));
        customerMap.put(5, new Customer(5, "Hao", "Hao@codegym.vn", "Miami"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
