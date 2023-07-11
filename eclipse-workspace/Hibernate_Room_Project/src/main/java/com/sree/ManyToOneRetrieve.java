package com.sree;

import java.util.List;

import org.hibernate.Session;

public class ManyToOneRetrieve {
	public static void main(String[] args) {
		Session se=Hiberntae_Util_Room.getSession();
		
		List<GroupOne>glist=se.createQuery("from GroupOne").list();
		glist.forEach(
				(x)->System.out.println("Group Id : "+x.getId()+" Group Name : "+x.getGname()+" Fees : "+x.getFees()
				+" College Id : "+x.getClo().getId()+" College Name : "+x.getClo().getCname()+" College Location : "+x.getClo().getClocation())
				
				);
	}

}
