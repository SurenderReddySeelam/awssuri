package com.example.demo.dto;

import com.example.demo.domain.Customer;

public class CustomerDTO {
	  private int id;
      private String name;
      private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public CustomerDTO(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public static Customer prepareCustomerEntity(CustomerDTO cust) {
		// TODO Auto-generated method stub
		Customer cEntity=new Customer();
		cEntity.setId(cust.getId());
		cEntity.setName(cust.getName());
		cEntity.setAge(cust.getAge());
		return cEntity;
	}
	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
      

      
}
