package com.qoct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ApplicationContext ap = new ClassPathXmlApplicationContext("NewFile1.xml");
		College c =(College)ap.getBean("Hai");
		System.out.println(c.toString());	
		ApplicationContext ap1 = new ClassPathXmlApplicationContext("NewFile1.xml");
		College c1 =(College)ap1.getBean("Hai1");
		System.out.println(c1.toString());

	}
}
