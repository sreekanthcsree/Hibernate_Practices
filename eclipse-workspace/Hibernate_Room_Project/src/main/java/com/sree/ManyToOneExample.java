package com.sree;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManyToOneExample {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		Transaction tr=se.beginTransaction();
		
		CollegeOne co=new CollegeOne();
		co.setId(101);
		co.setCname("SKUCET");
		co.setClocation("Anantapur");
		
		GroupOne go=new GroupOne();
		go.setId(1);
		go.setGname("ECE");
		go.setFees(50000.56f);
		go.setClo(co);
		
		GroupOne go1=new GroupOne();
		go1.setId(2);
		go1.setGname("EEE");
		go1.setFees(55000.56f);
		go1.setClo(co);
		
		se.save(go);
		se.save(go1);
		tr.commit();
		System.out.println("data inserted successfully....!");
		
		
	}

}
