package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.jvm.hotspot.memory.FileMapInfo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/collectionconfig.xml");
		Emp e = (Emp) context.getBean("emp");
		System.out.println(e.getDepartment());

		System.out.println(e.getNames());
		System.out.println(e.getPhoneNo());
		System.out.println(e.getCourses());
		
	}

}
