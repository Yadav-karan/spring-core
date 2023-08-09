package com.demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CourseUsingAnnotation {

	String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public CourseUsingAnnotation() {
		
	}

	public CourseUsingAnnotation(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Init method - Course");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroy method - Course");
	}
}
