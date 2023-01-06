package com.collectionExamples;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> ad =new ArrayDeque<String>();
		
		ad.push("sreekanth");
		ad.add("ajith");
		ad.add("anil");
		ad.add("pankaj");
		ad.add("ravi");
		ad.add("durga");
		ad.add("zampa");
		
		
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println(ad.peek());
		
		System.out.println(ad.pop());
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad.poll());
		System.out.println(ad);
	}

}
