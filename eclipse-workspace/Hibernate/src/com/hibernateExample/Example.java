package com.hibernateExample;

public class Example {
	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
public static void main(String[] args) {
	Example ex=new Example();
	ex.setId(1001);
	ex.setName("sree");
	ex.setLocation("chittoor");
	System.out.println("Id is:"+ex.getId());
	System.out.println("Name is:"+ex.getName());
	System.out.println("Location is:"+ex.getLocation());
}

}
