package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Check {
public static void main(String[] args) {
	
	//for init and destroy use the abstrctapplicationcontext
	AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycleconfig.xml");
	
	//The below method is to register hook for the destroy method
	con.registerShutdownHook();
	
	//using init and destroy method
	Lifecycle l=(Lifecycle) con.getBean("one");
	System.out.println(l);
	
	System.out.println("+++++++++++++++++++++++++++");
	
	//using interface filename is usinginterface.java
	UsingInterface u=(UsingInterface) con.getBean("two");
	System.out.println(u);
	
	//NOTE: look for individual bean step in the output 
}
}
