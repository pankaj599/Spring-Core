package com.spring.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/autowire/annotations/config_auto_xml.xml");
		//Employee e= (Employee)con.getBean("emp1");
//					OR
		Employee e=con.getBean("emp1",Employee.class);

		System.out.println(e);
	}

}
