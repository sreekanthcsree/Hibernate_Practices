package com.sree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FinalTestClass {

	public static void main(String[] args) {
	 Configuration cn=new Configuration();
	 cn.configure("NewFile.xml");
	 SessionFactory sf=cn.buildSessionFactory();
	 Session se=sf.openSession();
	 se.beginTransaction();
	 Transaction tr=se.beginTransaction();
	 
	 Person p=new Person();
	 p.setId(100);
	 p.setName("Sreekanth");
	 p.setSalary(30000.78f);
	 se.save(p);
	 
	 
	 Person p1=new Person();
	 p1.setId(101);
	 p1.setName("Ramlal");
	 p1.setSalary(49000.78f);
	 se.save(p1);
	 
	 Person p2=new Person();
	 p2.setId(102);
	 p2.setName("Satheesh");
	 p2.setSalary(50000.78f);
	 se.save(p2);
	 
	 tr.commit();
	 System.out.println("Record saved Successfully....!");

	}

}
