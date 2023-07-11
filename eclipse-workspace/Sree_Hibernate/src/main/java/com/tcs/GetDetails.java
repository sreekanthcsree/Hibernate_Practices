package com.tcs;

import java.util.List;

import org.hibernate.Session;

public class GetDetails {
	public static void main(String[] args) {
		Session se=HibernateUtil.getSession();
		
		List<Sunil>slist = se.createCriteria(Sunil.class).list();
		//enhanced for loop
		for(Sunil s:slist) {
			System.out.println("Sunil Id : "+s.getSid()+" Name : "+s.getName()+" Dept : "+s.getDept()+" Salary : "+s.getSalary());
		}
		System.out.println("-------------------------------------------------------------------------------------------->");
		//Lambda Expression
		slist.forEach(
				(x)->System.out.println("Sunil Id : "+x.getSid()+" Name : "+x.getName()+" Dept : "+x.getDept()+" Salary : "+x.getSalary())
				);
	}
}