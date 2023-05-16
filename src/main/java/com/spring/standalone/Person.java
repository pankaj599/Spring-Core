package com.spring.standalone;

import java.util.*;

public class Person {
	private List<String> names;
	private Map<String, Integer> courses;

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", courses=" + courses + "]";
	}

}
