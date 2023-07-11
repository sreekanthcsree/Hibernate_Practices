package com.sree;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="go")
public class GroupOne {
	@Id
	@Column(name="g_id")
	int id;
	@Column(name="g_name")
	String gname;
	@Column(name="fees")
	float fees;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="g_o_id",referencedColumnName="c_id")
	CollegeOne clo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public CollegeOne getClo() {
		return clo;
	}
	public void setClo(CollegeOne clo) {
		this.clo = clo;
	}
}
