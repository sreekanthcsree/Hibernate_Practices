package com.dextris;

public class StaticPoly {
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,short b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(float a,int b) {
		float c=a+b;
		System.out.println(c);
	}
	public void add(float a,double b) {
		double d=a+b;
		System.out.println(d);
	}
	public void add(String a,char b) {
		String c=a+b;
		System.out.println(c);
	}

  public static void main(String[] args) {
	StaticPoly sp=new StaticPoly();
	sp.add(10, 20);
	sp.add(10, 2);
	sp.add(20.5f, 10);
	sp.add(10f, 45.67d);
	sp.add("Sreekanth ", 'C');
  }
  }
