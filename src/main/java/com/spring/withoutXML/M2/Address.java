package com.spring.withoutXML.M2;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	@Value("Bhuwana")
	private String area;
	@Value("Udaipur")
	private String city;
	
	
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}


}
