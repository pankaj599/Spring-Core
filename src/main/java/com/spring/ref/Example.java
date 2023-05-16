package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		A i=(A) context.getBean("aref");
		System.out.println(i.getObj().getName());
		B b=(B) context.getBean("bref");
		System.out.println(b.getName());
	}

}
