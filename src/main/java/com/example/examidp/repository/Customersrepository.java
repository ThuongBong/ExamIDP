package com.example.examidp.repository;

import com.example.examidp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customersrepository extends JpaRepository<Customer, Integer> {
}

