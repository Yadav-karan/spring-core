package com.demo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientByNameAutowire {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/autowiring/employeebyname.xml");
		Employee emp = cxt.getBean("emp1",Employee.class);
		System.out.println(emp);
	}
}
