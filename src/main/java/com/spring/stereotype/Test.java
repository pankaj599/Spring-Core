package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont= new ClassPathXmlApplicationContext("com/spring/stereotype/component_config.xml");
		
		//NOTE HERE IN THE getBean ARGUMENTS BY DEFAULT IF IN THE @Component WE DIDN'T GIVE ANY NAME THEN THE NAME 
		//SHOULD BE THE CAMELCASE OF THE CLASS WE ARE USING
		Student s=cont.getBean("new_name",Student.class);
		System.out.println(s.getScourses());
	}

}
