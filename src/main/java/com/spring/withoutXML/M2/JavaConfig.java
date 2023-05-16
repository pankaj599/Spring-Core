package com.spring.withoutXML.M2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	//BHAI AB ADDRESS KI BEAN KE BAARE ME BHI TO BATANA PADEGA NA SPRING KO
	
	@Bean
	public Address rasta()
	{
		return new Address();
	}
	@Bean
	public Student kuchBhiDaalDo()
	{
		return new Student();
	}
}
