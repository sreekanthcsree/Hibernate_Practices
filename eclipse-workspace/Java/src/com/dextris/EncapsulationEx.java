package com.dextris;

public class EncapsulationEx {
	
	private int id;
	private String name;
	private float salary;
	
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
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		EncapsulationEx ex=new EncapsulationEx();
		ex.setId(101);
		ex.setName("Sreekanth");
		ex.setSalary(20000.56f);
		
		System.out.println("Id : "+ex.getId());
		System.out.println("Name : "+ex.getName());
		System.out.println("Salary : "+ex.getSalary());
	}

}
