package com.demo.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{ 33+66 }")
	private int x;
	
	@Value("#{ 8>5 ? 88:55}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25) }") //calling static method
	private int z;
	
	@Value("#{ T(java.lang.Math).PI }") // calling static variable
	private double e;
	
	@Value("#{ new java.lang.String('Karan Yadav') }") // passing object
	private String name;
	
	@Value("#{ 8-4 > 3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
