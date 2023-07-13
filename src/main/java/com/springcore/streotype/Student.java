package com.springcore.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Denton")
	private String city;
	
	@Value("Digvijay")
	private String student_name;
	
	@Override
	public String toString() {
		return "Student [city=" + city + ", student_name=" + student_name + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

}
