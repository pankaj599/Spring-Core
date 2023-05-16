package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("new_name")
@Scope("prototype")
public class Student {
	@Value("Pankaj Kumar Vijayvergiya")
	private String sname;
	
	@Value("Udaipur")
	private String scity;
	
	@Value("#{temp}")
	private List<String> scourses;

	public List<String> getScourses() {
		return scourses;
	}
	public void setScourses(List<String> scourses) {
		this.scourses = scourses;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", scity=" + scity + ", scourses=" + scourses + "]";
	}
}
