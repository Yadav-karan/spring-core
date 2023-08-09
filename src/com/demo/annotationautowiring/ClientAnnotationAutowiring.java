package com.demo.annotationautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAnnotationAutowiring {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/annotationautowiring/employee.xml");
		Employee emp = cxt.getBean("emp1",Employee.class);
		System.out.println(emp);
	}
}
