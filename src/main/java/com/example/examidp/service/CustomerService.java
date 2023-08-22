package com.example.examidp.service;

import com.example.examidp.entity.Customer;
import com.example.examidp.repository.Customersrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final Customersrepository customersRepository;

    @Autowired
    public CustomerService(Customersrepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customer> findAll() {
        return customersRepository.findAll();
    }

    public Customer add(Customer customer) {
        return customersRepository.save(customer);
    }

}
