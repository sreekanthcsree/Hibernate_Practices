package com.conditionalStmts;

public class ContinueEx {
	public static void main(String[] args) {
		int i;
		for(i=0;i<=10;i++) {
			if(i==5 ||i==7 ||i==9) {
				continue;
			}
			System.out.println(i);
		}
	}

}
