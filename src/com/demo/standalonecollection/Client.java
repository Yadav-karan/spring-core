package com.demo.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/standalonecollection/standalone.xml");
		Person p = cxt.getBean("p1",Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
	}
}
