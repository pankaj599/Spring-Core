package com.spring.withoutXML.M2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s =context.getBean("kuchBhiDaalDo",Student.class);
		System.out.println(s);
	}

}
