package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/constructor/constructorconfig.xml");
Person p=(Person) context.getBean("Per");
System.out.println(p);
	}

}
