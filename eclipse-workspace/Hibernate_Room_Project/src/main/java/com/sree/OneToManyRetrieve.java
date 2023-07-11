package com.sree;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;



public class OneToManyRetrieve {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		
		List<InstituteOne>clist=se.createQuery("from InstituteOne").list();
		 Iterator<InstituteOne>itr=clist.iterator();
		 while(itr.hasNext()) {
			   InstituteOne ins=itr.next();
			   System.out.println(" Institute id : "+ ins.getId() +" Name : "+ins.getName()+" Location : "+ins.getLocation());
		 List<CourseOne>list=ins.getCo();
		list.forEach(
				(y)->System.out.println("Course Id : "+y.getCid()+" Course Name : "+y.getCname()+" Fees : "+y.getFees())
				);
	}

	}}
