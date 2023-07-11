package com.qoct;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCon {
	int qid;
	Map<String, String>ma;
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setMa(Map<String, String> ma) {
		this.ma = ma;
	}
	public void display() {
		System.out.println("Question id: "+qid + "Question Map: " + ma.toString());
		System.out.println("----------------------------------------------------------->");
		
		Set s=ma.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			String k=(String)itr.next();
			String d=ma.get(k);
			System.out.println("Key : "+k+"Value : "+d);
		}
	}
}
