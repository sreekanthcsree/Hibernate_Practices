package com.dextris;

public class InheritanceOne extends Inheritance{
	
	public void sree1(int a,int b) {
		int c=a-b;
		System.out.println("Child class : "+c);
	}
	public static void main(String[] args) {
		InheritanceOne io=new InheritanceOne();
		io.sree(10, 20);
		io.sree1(20, 10);
		
	}

}