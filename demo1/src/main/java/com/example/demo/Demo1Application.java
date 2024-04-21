package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.repo.Customerrepo;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Autowired
	private CustomerService repo;
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CustomerDTO c1=new CustomerDTO(1,"Suri","25");
		repo.insertCustomer(c1);
	}

}
