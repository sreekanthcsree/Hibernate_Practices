package com.sree;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@Column(name="e_id")
	int id;
	@Column(name="e_name")
	String name;
	@Column
	String role;
	@Column
	float salary;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="no",referencedColumnName="a_dno")
	Address Add;

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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return Add;
	}
	public void setAdd(Address add) {
		Add = add;
	}
}
