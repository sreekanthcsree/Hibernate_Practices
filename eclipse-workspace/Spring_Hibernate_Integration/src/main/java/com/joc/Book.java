package com.joc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@Column(name="b_id")
	int b_id;
	@Column(name="b_name")
	String b_name;
	@Column
	int price;
	
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getB_id() {
		return b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public int getPrice() {
		return price;
	}
}