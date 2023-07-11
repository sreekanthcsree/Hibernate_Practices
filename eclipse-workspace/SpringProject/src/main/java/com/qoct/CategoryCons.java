package com.qoct;

public class CategoryCons {
	String cname;
	Book bk;
	
	public CategoryCons(String cname, Book bk) {
		this.cname = cname;
		this.bk = bk;
	}
	public void test() {
		System.out.println("Category Name : "+cname);
		bk.display();
	}  
}
