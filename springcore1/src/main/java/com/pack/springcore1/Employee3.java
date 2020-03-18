package com.pack.springcore1;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee3 {
	private int id;  
	private String name;  
	@Autowired
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	void show(){  
	    System.out.println(id+" "+name); 
	    address.show();
	}  
}
