package com.qoct;

public class Book {
	int bid;
	String bname;
	float price;
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Book id : "+bid+" Book Name : "+bname+" Price : "+price);
	}
}
