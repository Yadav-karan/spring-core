package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
//		Employee eRef = new Employee();
//		eRef.setEid(101);
//		eRef.seteName("Tom");
//		eRef.seteAddress("NYC");
//		
//		System.out.println(eRef);
		
		// IOC (inversion of control)
		// BeanFactory
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory factory = new XmlBeanFactory(resource); // spring container which shall parse the xml and construct the objects
		Employee emp1 = factory.getBean("emp1",Employee.class);
		
		System.out.println("Employee 1 Details: "+emp1);
		
		//ApplicationContext
//		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
//		Employee emp2 = context.getBean("emp2",Employee.class);
		
//		System.out.println("Employee 1 Details: "+emp2);
//		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
//		cxt.close();
		
	}

}
