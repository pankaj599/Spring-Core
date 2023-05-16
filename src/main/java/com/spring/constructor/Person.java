package com.spring.constructor;

import java.util.List;

public class Person {
	private String name;
	private int rollNo;
	private Certi certi;
	private List<String> l;
	public Person(String name, int rollNo, Certi certi, List<String> l) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.certi = certi;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", rollNo=" + rollNo + ", certi=" + this.certi.setcerti() + ", l=" + l + "]";
	}
	
}
