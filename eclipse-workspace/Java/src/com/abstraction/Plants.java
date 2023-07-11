package com.abstraction;

public class Plants implements Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("AnimalSound");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleep");
	}
	public static void main(String[] args) {
		Plants p=new Plants();
		p.animalSound();
		p.sleep();
	}

}
