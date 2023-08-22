package com.example.examidp;

import com.example.examidp.entity.Customer;
import com.example.examidp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ExamIdpApplication implements CommandLineRunner {
    private final CustomerService customerService;

    @Autowired
    public ExamIdpApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExamIdpApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Customer> customers = customerService.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
