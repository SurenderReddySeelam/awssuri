package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Customer;

public interface Customerrepo extends JpaRepository<Customer,Integer>{
    
}
