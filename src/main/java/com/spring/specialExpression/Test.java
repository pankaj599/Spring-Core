package com.spring.specialExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont= new ClassPathXmlApplicationContext("com/spring/specialExpression/config.xml");
		Demo d= cont.getBean("demo",Demo.class);
		System.out.println(d);

	}

}
