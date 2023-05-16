package com.spring.withoutXML.M2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("Pankaj")
	private String name;
	@Value("56")
	private int age;
	@Autowired
	private Address address;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
