package com.conditionalStmts;

public class SingleArrayEx {
	public static void main(String[] args) {
		
		/*int []i=new int[5];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.print(i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]);
		*/
		int i[]= {10,20,30,40,60};//Declare an array without specify size	
		
		//System.out.println("Array numbers : "+i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]);
		System.out.println("Length of an array : "+i.length);//Size of an array
		System.out.println(i[2]);//to read specific value
		System.out.println("--------->");
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);		
		}
		System.out.println("---------------------------------------->");	
		//to use foreach loop
		for(int x:i) {
			System.out.println(x);
		}
	}
}