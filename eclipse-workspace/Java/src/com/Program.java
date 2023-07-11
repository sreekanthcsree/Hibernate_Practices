package com;

public class Program {
	static int arra1[]= {1,2,3,4,7,8,10,13,14,57,34,19,17,20};
	
	
	public static  void evenAndOdd(int arr[]) {
		int a[]=new int[arr.length];
		
		int index=0;
		//even numbers
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 ==0) {
				a[index] = arr[i];
				index++;
			}
		}
		//odd numbers
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 !=0) {
				a[index] = arr[i];
				index++;
			}
      }
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
  }
	public static void main(String[] args) {
		evenAndOdd(arra1);
	}
 }