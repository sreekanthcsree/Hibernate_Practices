package com.inheritance;

public class InheritanceTwo extends InheritanceOne {
	
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("the multiplication of two numbers is : "+c);
	}
	
	public static void main(String[] args) {
		InheritanceTwo it=new InheritanceTwo();
		it.add(10, 20);
		it.sub(20, 30);
		it.mul(40, 50);
	}

}
