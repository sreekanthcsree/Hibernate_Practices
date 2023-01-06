package com.collectionExamples;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
	Stack<Integer> vc =new Stack<Integer>();
	Stack<String> st =new Stack<String>();
	 
	vc.push(10);
	vc.push(20);
	vc.push(30);
	vc.push(40);
	vc.push(50);
	vc.push(60);
	st.add("sree");
	st.add("ajith");
	st.push("sree");
	
	System.out.println(vc);
	System.out.println(vc.size());
	System.out.println(vc.indexOf(20));
	
	System.out.println(vc.peek());//top in the method
	System.out.println(vc.pop());//remove the top most value
	System.out.println(vc);
	
	System.out.println(vc.removeAll(vc));
	System.out.println(vc);
	
	System.out.println(st);
//	System.out.println(st.removeAll(st));
	
	
	

}
}