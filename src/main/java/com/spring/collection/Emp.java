package com.spring.collection;

import java.util.*;

public class Emp {
	private String department;
	private List<String> names;
	private Set<Integer> phoneNo;
	private Map<String, String> courses;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Integer> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp(String department, List<String> names, Set<Integer> phoneNo, Map<String, String> courses) {
		super();
		this.department = department;
		this.names = names;
		this.phoneNo = phoneNo;
		this.courses = courses;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
