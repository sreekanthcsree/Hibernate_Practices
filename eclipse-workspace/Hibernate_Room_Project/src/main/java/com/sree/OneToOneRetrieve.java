package com.sree;

import java.util.List;

import org.hibernate.Session;

public class OneToOneRetrieve {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		//retrieve the values
		
		List<Employee> elist =se.createQuery("from Employee").list();
		//lambda expression
		elist.forEach(
				(emp)->System.out.println("Employee Id : "+emp.getId()+" Employee Name : "+emp.getName()+" Employee Role : "+emp.getRole()+" Salary : "+emp.getSalary()+
						"Door No : "+emp.getAdd().getDno()+" Name : "+emp.getAdd().getName()+" Salary : "+emp.getAdd().getSalary())
				
				
				);
		
	}

}
