package com.demo.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/stereotype/stereoconfig.xml");
		Student st = cxt.getBean("obj",Student.class);
		System.out.println(st);
	}
}
