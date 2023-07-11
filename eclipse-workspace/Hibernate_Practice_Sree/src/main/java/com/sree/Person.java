package com.sree;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	@Id
	@Column
	int id;
	@Column
	String name;
	@Column
	float salary;
	
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
}
