package com.conditionalStmts;

public class IfElseIfEx {
	
	public static void main(String[] args) {
		
		int age=60;
		
		if(age>=18 && age>=60) {
			System.out.println("He/she are eligible for vote and they are elder people");
	}
	else if(age>=18 && age<=60) {
		System.out.println("He/she are eligible for vote and they are not elder people");
		
	}else {
		System.out.println("He/she are not eligible for vote");
	}
 }
}
