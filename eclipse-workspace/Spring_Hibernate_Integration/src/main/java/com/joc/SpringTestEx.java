package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestEx {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Hibernate_Integration_config.xml");
		//BookDao b=(BookDao)ac.getBean("bd");
		//b.sreeBook();
		//b.getBookDetails();
		//b.updateBookDetails();
		//b.deleteRecord();
		
		TheatreDao td=(TheatreDao)ac.getBean("t");
		//td.save();
		td.getMovieDetails();
		
		
	}
}
