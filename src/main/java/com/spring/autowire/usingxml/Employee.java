package com.spring.autowire.usingxml;

public class Employee {
	private Address address;

	public Address getAddress() {
		System.out.println("inside getter");
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}

	@Override
	public String toString() {
		System.out.println("printing time");
		return "Employee [address=" + address + "]";
	}

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
