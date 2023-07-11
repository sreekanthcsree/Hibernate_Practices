package com;

public class SentenceReverse {
	public static void Reverse(int n) {	
		String s1="Welcome To HTML and Java Classes";
		String a[]=s1.split(" ");
		for(int i=n;i>=0;i--) {
			System.out.print(a[i]+" ");
			
	}
		for(int j=n+1;j<a.length;j++) {
			System.out.print(a[j]+" ");
			
	}	
}
	public static void main(String[] args) {
		Reverse(4);
	}
}


