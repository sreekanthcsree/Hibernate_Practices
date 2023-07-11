package com.sree;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetPersonDetails {
	public static void main(String[] args) {
		Configuration cnf=new Configuration();
		cnf.configure("NewFile.xml");
		SessionFactory sf=cnf.buildSessionFactory();
		Session se=sf.openSession();
		
		List<Person> plist =se.createCriteria(Person.class).list();
		//for loop
		for(int i=0;i<plist.size();i++) {
			Person p =plist.get(i);
			System.out.println("Person Id : "+p.getId()+" Person Name : "+p.getName()+" Location : "+p.getLocation()+" Salary : "+p.getSalary());
		}
		System.out.println("-----------------------------------------------------------------");
		//for each loop
		for(Person i:plist) {
			System.out.println("Person Id : "+i.getId()+" Person Name : "+i.getName()+" Location : "+i.getLocation()+" Salary : "+i.getSalary());
		}
		System.out.println("------------------------------------------------------------------");
		// //Iterator
	       Iterator<Person> itr=plist.iterator();
	       while(itr.hasNext()) {
	    	   Person pe=itr.next();
	    	   System.out.println("Person Id : "+pe.getId()+" Person Name : "+pe.getName()+" Location : "+pe.getLocation()+" Salary : "+pe.getSalary());
	       }
	      System.out.println("------------------------------------------------------------------");
	       //Lambda Expression
	       plist.forEach(
	    		   (per)->System.out.println("Person Id : "+per.getId()+" Person Name : "+per.getName()+" Location : "+per.getLocation()+" Salary : "+per.getSalary())
	    		   );		
	}

}
