package com.polymorphism;

public class StaticPolyEx {
	
	public void sree(double d,float f) {
		double k=d+f;
		System.out.println(k);
	}
	public void sree(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sree(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void sree(int a,float f) {
		float z=a+f;
		System.out.println(z);
	}
	public static void main(String[] args) {
		StaticPolyEx sp=new StaticPolyEx();
		sp.sree(10, 20);
		sp.sree(10, 20, 30);
		sp.sree(10, 30.45f);
		sp.sree(50.45d, 65.64f);
	}
}
