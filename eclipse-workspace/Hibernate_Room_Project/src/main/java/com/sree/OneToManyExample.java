package com.sree;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToManyExample {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		Transaction tr=se.beginTransaction();
		
		CourseOne c=new CourseOne();
		c.setCid(1);
		c.setCname("Java");
		c.setFees(30000);
		
		CourseOne c1=new CourseOne();
		c1.setCid(2);
		c1.setCname("Testing");
		c1.setFees(35000);
		
		InstituteOne i=new InstituteOne();
		i.setId(101);
		i.setName("JSpider");
		i.setLocation("Marathahalli");
		
		
		List<CourseOne>clist=new ArrayList<CourseOne>();
		clist.add(c);
		clist.add(c1);
		
		i.setCo(clist);
		
		se.save(i);
		tr.commit();
		System.out.println("Data inserted successfully....!");
	}

}
