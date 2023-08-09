package com.demo.construct;

import java.util.List;

public class Person {

	String name;
	int age;
	Course course;
	List<String> hobbies;
	
	public Person(String name, int age,Course course,List<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", course=" + course + ", hobbies=" + hobbies + "]";
	}

}
