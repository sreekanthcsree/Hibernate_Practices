package com.tcs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getSession() {
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}
}
