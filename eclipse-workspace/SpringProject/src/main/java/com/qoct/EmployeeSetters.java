package com.qoct;

public class EmployeeSetters {
	int id;
	String name;
	int salary;
	AddressSetters ad;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setAd(AddressSetters ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "EmployeeSetters id=" + id + ", name=" + name + ", salary=" + salary + ", ad=" + ad +ad.toString() ;
	}	
	
}
