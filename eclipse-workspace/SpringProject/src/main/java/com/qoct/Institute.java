package com.qoct;

public class Institute {
	int id;
	String name;
	String location;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Institute id: " + id + " name: " + name + "location: " + location ;
	}
	
}
