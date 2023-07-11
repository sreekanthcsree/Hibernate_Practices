package com.qoct;

public class Category {
	String cname;
	Book bk;
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public void test() {
		System.out.println("Category Name : "+cname);
		bk.display();
	}
}
