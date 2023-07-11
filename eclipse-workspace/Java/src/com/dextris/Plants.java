package com.dextris;

public class Plants implements Animal {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Hi, I am Sreekanth");
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("I am currently working in Dextris Infoservices Pvt Ltd...Bangalore");
		
	}
	public static void main(String[] args) {
		Plants p=new Plants();
		p.say();
		p.hello();
	}

}
