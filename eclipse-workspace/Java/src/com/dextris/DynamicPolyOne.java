package com.dextris;

public class DynamicPolyOne extends DynamicPoly{
	
	public void hello(int a,int b) {
		super.hello(40, 20);
		int c=a+b;
		System.out.println("Child class : "+c);
	}
	public static void main(String[] args) {
		DynamicPolyOne dp=new DynamicPolyOne();
		dp.hello(10, 20);
	}

}
