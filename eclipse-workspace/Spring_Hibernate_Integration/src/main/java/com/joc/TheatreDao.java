package com.joc;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TheatreDao {
	SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void save() {
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		Theatre t=new Theatre(456, "PVR",new Date());
		se.save(t);
		tr.commit();
		System.out.println("Saved record");
	}
	public void getMovieDetails() {
		Session se=sf.openSession();
		List<Theatre>tlist=se.createQuery("from Theatre").list();
		for(Theatre th:tlist) {
			System.out.println( th.toString() );
		}
	}
	public  void updateDetails() {
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		Theatre t=new Theatre();
		
	
	}
}
