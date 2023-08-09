package com.demo.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {

	@Value("karan")
	private String studentName;
	@Value("Mumbai")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	public Student() {
		
	}
	
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
}
