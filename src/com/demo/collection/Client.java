package com.demo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/collection/collectionconfig.xml");
		Emp e1 = context.getBean("emp1",Emp.class);
		
		System.out.println("Name: "+e1.getName());
		System.out.println("Phones: "+e1.getPhones());
		System.out.println("Address: "+e1.getAddress());
		System.out.println("Courses: "+e1.getCourse());
	}
}
