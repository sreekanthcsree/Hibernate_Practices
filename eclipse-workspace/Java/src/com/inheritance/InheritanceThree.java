package com.inheritance;

public class InheritanceThree extends InheritanceTwo{
	public void div(int a,int b) {
		int c=b/a;
		System.out.println("the Division of two numbers is : "+c);
	}
	public void remainder(int a,int b) {
		int c=a%b;
		System.out.println("Remainder value is : "+c);
	}
	public static void main(String[] args) {
		InheritanceThree it1=new InheritanceThree();
		it1.add(10, 20);
		it1.sub(20, 30);
		it1.mul(10, 20);
		it1.div(40,20);
		it1.remainder(17, 3);
	}

}
