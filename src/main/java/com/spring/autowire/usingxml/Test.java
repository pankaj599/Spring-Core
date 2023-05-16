package com.spring.autowire.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/autowire/usingxml/config_auto_xml.xml");
		Employee e= (Employee)con.getBean("emp1");
//					OR
//	Employee e=con.getBean("emp1",Employee.class);
		Employee e1=con.getBean("emp2",Employee.class);
		Employee e2=(Employee)con.getBean("emp3");
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
	}

}
