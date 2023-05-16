package com.spring.lifecycle;

public class Lifecycle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Lifecycle [name=" + name + "]";
	}
	//creating init and destroy method

	public void init()
	{System.out.println("yo yo honeysingh");}
	public void destroy()
	{System.out.println("bye bye");}
}
