package com.conditionalStmts;

public class TwoDimensionalEx {
	
	public static void main(String[] args) {
		
		int [][]  i=new int[3][2];
		
		i[0][0]=100;
		i[0][1]=200;
		i[1][0]=300;
		i[1][1]=400;
		i[2][0]=500;
		i[2][1]=600;
		
		//int a[][]={{100,200},{300,400},{500,600}}; 
		
		System.out.println("Number of rows : "+i.length);
		System.out.println("Number of columns : "+i[0].length);
		
		//to use nested forloop
		
		for(int x=0;x<i.length;x++) {  //outer for loop
			for(int y=0;y<i[x].length;y++) {   //inner for loop
				System.out.println(i[x][y]);
			}
		}
	}
}