package com.spring.specialExpression;

public class Course {
	private String cname;
	private int fees;
	
	public Course(String cname, int fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}

	

}
