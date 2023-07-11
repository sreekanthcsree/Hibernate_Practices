package com.sree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Util_Sree {
	public static Session getSession() {
		Configuration cn=new Configuration();
		cn.configure("NewFile.xml");
		SessionFactory sf=cn.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}

}
