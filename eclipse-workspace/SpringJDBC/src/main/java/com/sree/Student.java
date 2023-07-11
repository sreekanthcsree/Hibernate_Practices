package com.sree;

public class Student {
	
	int id;
	String name;
	String location;
	
	public Student(int id,String name,String location) {
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
}
