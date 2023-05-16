package com.spring.withoutXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Pankaj")
	private String name;
	@Value("56")
	private int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
