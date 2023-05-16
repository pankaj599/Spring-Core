package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/standalone/standalone_config.xml");
		Person p=con.getBean("person",Person.class);
		
		System.out.println(p.getNames());
		//here getNames is the getter method while getName is the inbuilt method
		System.out.println(p.getNames().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(p.getCourses());
	}

}
