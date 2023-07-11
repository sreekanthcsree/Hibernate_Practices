package com.sree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDetails {
	public static void main(String[] args) {	
		
	Configuration cnf=new Configuration();
	cnf.configure("NewFile.xml");
	SessionFactory sf=cnf.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tr=se.beginTransaction();
	
	Person p2=new Person();
	p2.setId(103);
	p2.setName("Ramlal");
	p2.setLocation("Pathapalyam");
	p2.setSalary(30000.27f);
	
	se.save(p2);
	
	Person p3=new Person();
	p3.setId(104);
	p3.setName("Nani");
	p3.setLocation("Chennai");
	p3.setSalary(65000.34f);
	
	se.save(p3);
	tr.commit();
	
	}
}
