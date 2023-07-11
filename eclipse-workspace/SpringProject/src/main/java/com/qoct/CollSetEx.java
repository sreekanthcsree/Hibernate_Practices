package com.qoct;

import java.util.Iterator;
import java.util.Set;

public class CollSetEx {
	int qid;
	String qname;
	Set<String> sj;
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public void setSj(Set<String> sj) {
		this.sj = sj;
	}
	public void Durga() {
		System.out.println("Question Id : "+qid+"Name : "+qname);
		
		Iterator<String> it = sj.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
