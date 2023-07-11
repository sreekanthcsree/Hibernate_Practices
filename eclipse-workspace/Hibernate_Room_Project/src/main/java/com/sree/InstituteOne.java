package com.sree;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ins")
public class InstituteOne {
	
	@Id
	@Column(name="i_id")
	int id;
	@Column(name="i_name")
	String name;
	@Column(name="i_location")
	String location;
	@OneToMany(targetEntity=CourseOne.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="cou",referencedColumnName="i_id")
	List<CourseOne>co;
	
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
	public List<CourseOne> getCo() {
		return co;
	}
	public void setCo(List<CourseOne> co) {
		this.co = co;
	}
}
