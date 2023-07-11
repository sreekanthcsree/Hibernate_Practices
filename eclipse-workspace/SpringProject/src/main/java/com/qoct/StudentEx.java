package com.qoct;

import java.util.List;
import java.util.ListIterator;

public class StudentEx {
	int id;
	String qname;
	List<String>answers;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void display() {
		System.out.println("Qusetion id: "+id+"Qname: "+qname+"");
		
	
  ListIterator<String> itr=answers.listIterator();
     while(itr.hasNext()) {
    	 String a=String.valueOf(itr.next());
    	 System.out.println("Answers: "+a);
     }
}
	
}
