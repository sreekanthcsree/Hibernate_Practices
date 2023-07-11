package com.dextris;

public class InheritanceThree extends InheritanceOne{
	
	public void sree2(int a,int b,int c) {
		int z=a+b*c;
		System.out.println("Super child class : "+z);
	}
	public static void main(String[] args) {
		InheritanceThree it=new InheritanceThree();
		it.sree(10, 20);
		it.sree1(20, 10);
		it.sree2(10, 20, 30);
	}
}
