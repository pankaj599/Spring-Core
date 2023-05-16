package com.spring.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	/*we can use autowired here*/
	//@Autowired
	//@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired /*we can use autowired here*/
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	//@Autowired /*we can use autowired here*/
	public Employee(Address address) {
		
		super();
		System.out.println("inside constructor");
		this.address = address;
		System.out.println("bye bye");
	}

	public Employee() {
		super();
		System.out.println("inside super");
		// TODO Auto-generated constructor stub
	}



	

}
