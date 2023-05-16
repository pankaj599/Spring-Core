package com.spring.specialExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	//USE OF SPRING EXPRESSION
	@Value("#{20+40-4}")
	private int x;
	@Value("44")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double a;
	
	@Value("#{new java.lang.String('pankaj')}")
	private String name;
	
	@Value("#{new com.spring.specialExpression.Course('java', 500)}")
	private Course c;
	
	
	@Override
	public String toString() {
		System.out.println(((Object)x).getClass().getSimpleName()+" "+c.getClass().getSimpleName());
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", c=" + c + "]";
	}
}
