package com.demo.constructambi;

public class Addition {

	int a;
	int b;
	
	public Addition(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println("int,int");
	}
	
	public Addition(double a,double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double,double");
	}
	
	void doSum() {
		System.out.println("Sum is: "+(this.a+this.b));
	}
}
