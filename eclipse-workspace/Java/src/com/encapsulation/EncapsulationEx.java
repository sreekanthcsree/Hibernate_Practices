package com.encapsulation;

//using with setters and getters methods
public class EncapsulationEx {
	int id;
	String name;
	String location;
	String role;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
 public static void main(String []args) {
	 EncapsulationEx e=new EncapsulationEx();
	 e.setId(101);
	 e.setName("Sandilya");
	 e.setLocation("Bangalore");
	 e.setRole("Associate Business Analyst");
	 
	 System.out.println("Id : "+e.getId()+","+" Name : "+e.getName()+","+ " Location : "+e.getLocation()+","+" Role : "+e.getRole());
  }

}
