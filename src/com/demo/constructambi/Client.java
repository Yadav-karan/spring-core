package com.demo.constructambi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/constructambi/addition.xml");
		Addition add = context.getBean("add",Addition.class);
		add.doSum();
	}
}
