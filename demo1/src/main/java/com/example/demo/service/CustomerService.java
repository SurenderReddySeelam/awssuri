package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.repo.Customerrepo;
@Service("custService")
public class CustomerService {
	@Autowired
	private Customerrepo repo;
     public void insertCustomer(CustomerDTO cust) {
    	 repo.saveAndFlush(CustomerDTO.prepareCustomerEntity(cust));
    	 System.out.println("added");
   
     }
}
