package com.demo.construct;

public class Course {

	String name;
	
	Course(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
}

