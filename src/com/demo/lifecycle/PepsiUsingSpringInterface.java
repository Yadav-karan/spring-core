package com.demo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiUsingSpringInterface implements InitializingBean,DisposableBean {

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting the price: Pepsi");
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi : init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Putting back pepsi bottle: destroy method");
	}
	
	
	
	
}
