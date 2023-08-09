package com.demo.standalonecollection;

import java.util.List;

public class Person {

	List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
}
