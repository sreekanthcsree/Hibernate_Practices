package com.qoct;

public class College {
	int id;
	String name;
	String Location;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "College id :" + id + ", name :" + name + ", Location :" + Location ;
	}
	

}
