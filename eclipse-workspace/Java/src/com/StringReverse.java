package com;

public class StringReverse {
	public static void main(String[] args) {
		String s="Raju Sree";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println("Reverse the word : "+sb);
		System.out.println("--------------------------------------------------------->");
			
		String s1="Hai Hello Iam Sreekanth";
		String a[]=s1.split(" ");
		for(int i=a.length-1;i>=0;i--) {	
			System.out.print(a[i]+" ");
		}
	}
}
