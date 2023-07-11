package com.tcs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SunilSaveDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf=con.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tr=se.beginTransaction();
        
        Sunil s=new Sunil();
        s.setSid(101);
        s.setName("VijayaDurga");
        s.setDept("EEE");
        s.setSalary(30000.67f);
        
        se.save(s);
        tr.commit();
        System.out.println("data successfully saved");
	}

}
