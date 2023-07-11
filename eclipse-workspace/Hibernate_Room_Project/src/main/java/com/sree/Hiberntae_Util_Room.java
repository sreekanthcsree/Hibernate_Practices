package com.sree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hiberntae_Util_Room {
	public static Session getSession() {
		Configuration cnf=new Configuration();
		cnf.configure("NewFile.xml");
		SessionFactory sf=cnf.buildSessionFactory();
		Session se=sf.openSession();
		return se;
		
	}

}
