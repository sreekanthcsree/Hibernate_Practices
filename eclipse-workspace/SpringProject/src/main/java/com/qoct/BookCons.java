package com.qoct;

public class BookCons {
	int bid;
	String bname;
	float price;
	
	public BookCons(int bid, String bname, float price) {
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book id : "+bid+" Book Name : "+bname+" Price : "+price);
	}
}
