package com.demo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/demo/spel/stereoconfig.xml");
		Demo demo = cxt.getBean("demo",Demo.class);
		System.out.println(demo);
		
		SpelExpressionParser spel = new SpelExpressionParser();
		Expression parseExpression = spel.parseExpression("99+109");
		
		System.out.println(parseExpression.getValue());
	}

}
