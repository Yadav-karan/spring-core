package com.demo.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/lifecycle/samosa.xml");
		Samosa s1 = cxt.getBean("s1",Samosa.class);
		System.out.println(s1.price);
		cxt.registerShutdownHook();
		
		PepsiUsingSpringInterface pepsi = cxt.getBean("p1",PepsiUsingSpringInterface.class);
		System.out.println(pepsi.price);
		
		CourseUsingAnnotation course = cxt.getBean("c1",CourseUsingAnnotation.class);
		System.out.println(course.courseName);
	}
}
