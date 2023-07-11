package com.sree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("configDAO.xml");
		
		SpringDAO ex=(SpringDAO)ctx.getBean("save");
		ex.sree(new Student(104, "nagaraju", "S R Puram"));
		System.out.println("Record Saved Successfully");
		
	
			ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\91958\\eclipse-workspace\\SpringJDBC\\src\\main\\resources\\configDAO.xml");
			UpdateAndDelete u = (UpdateAndDelete)ac.getBean("uad");
			u.update(new Student(2546256, "Hello", "TPT"));
			u.delete(new Student(2546256, "null", "null"));
	}
}