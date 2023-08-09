package com.demo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientByTypeAutowire {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/autowiring/employeebytype.xml");
		Employee emp = cxt.getBean("emp1",Employee.class);
		System.out.println(emp);
	}
}
