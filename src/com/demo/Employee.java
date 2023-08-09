package com.demo;

public class Employee {
	int eid;
	String eName;
	Address address;
	
	public Employee() {
		
	}
	
	//constructor injection
	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
	public Address getAddress() {
		return address;
	}

	//setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	public void myInit() {
		System.out.println("--Object Initialized--");
	}
	
	public void myDestroy() {
		System.out.println("--Object Destroyed--");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", address=" + address + "]";
	}
	
}
