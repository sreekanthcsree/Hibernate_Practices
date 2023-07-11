package com.sree;

import java.util.List;

import org.hibernate.Session;

public class GetPesonDetails {

	public static void main(String[] args) {
		Session se=Hibernate_Util_Sree.getSession();
		List<Person>plist=se.createCriteria(Person.class).list();
		
		for(Person pe:plist) {
			System.out.println("Person id : "+pe.getId()+" Person Name : "+pe.getName()+" Person Salary : "+pe.getSalary());
		}
	}

}
