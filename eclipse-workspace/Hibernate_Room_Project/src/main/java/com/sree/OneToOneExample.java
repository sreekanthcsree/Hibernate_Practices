package com.sree;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneExample {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		Transaction tr=se.beginTransaction();
		
		Address ad=new Address();
		ad.setDno(2-39);
		ad.setName("Raju");
		ad.setSalary(30000);
		
		Employee emp=new Employee();
		emp.setId(1510214);
		emp.setName("Sreekanth");
		emp.setRole("Java Developer");
		emp.setSalary(40000.56f);
		emp.setAdd(ad);
		
		se.save(emp);
		tr.commit();
		System.out.println("data successfully inserted...!");
	}
}
