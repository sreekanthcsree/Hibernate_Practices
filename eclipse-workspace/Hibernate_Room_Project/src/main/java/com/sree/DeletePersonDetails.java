package com.sree;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeletePersonDetails {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		Transaction tr=se.beginTransaction();
		
		Person p = (Person) se.get(Person.class,new Integer(104));
	//	se.delete("nani", p);  or
		se.delete(p);
		tr.commit();
		System.out.println("Successfully Deleted the One row");
	}
}