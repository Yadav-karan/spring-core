package com.demo.lifecycle;

public class Samosa {
	
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting the price Samosa");
		this.price = price;
	}
	
	public void myInit() {
		System.out.println("Init method called");
	}
	
	public void myDestroy() {
		System.out.println("Destroy method called");
	}
}
