package com.polymorphism;

public class DynamicPolyExOne extends DynamicPolyEx {
	
	public void hello(int i,int j) {
		super.hello(50,30);
		int c=i+j;
		System.out.println("Child Class : "+c);
	}
	public static void main(String[] args) {
		DynamicPolyExOne dx=new DynamicPolyExOne();
		dx.hello(20, 30);
		dx.m1();
	}

}
