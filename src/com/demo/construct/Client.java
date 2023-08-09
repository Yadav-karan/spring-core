package com.demo.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/construct/person.xml");
		Person p = context.getBean("person1",Person.class);
		
		System.out.println(p);
	}
}
