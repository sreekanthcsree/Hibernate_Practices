package com.conditionalStmts;

public class NestedIfEx {
	
	public static void main(String[] args) {
		
		int telugu=35;
		int hindi=30;
		
		if(telugu>=30) {
			if(hindi>=32) {
				System.out.println("Passed");
		}else {
			System.out.println("Failed in Hindi");
		}
	}
  }
}
