package com.qoct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("NewFile1.xml");
		/*Institute in=(Institute)ac.getBean("i1");
		System.out.println(in.toString());AddressSetters
*/	
		/*Employee ex=(Employee)ac.getBean("d");
		System.out.println(ex.toString());
		
		Address as=(Address)ac.getBean("d1");
		System.out.println(as.toString());
		*/
		/*
		EmployeeSetters es=(EmployeeSetters)ac.getBean("es");
		System.out.println(es.toString());
		
		AddressSetters as=(AddressSetters)ac.getBean("as1");
		System.out.println(as.toString());
		*/
		
		/*MapCon mc= (MapCon)ac.getBean("n");
		mc.display();*/
		
		/*CollSetEx cx=(CollSetEx)act.getBean("cs");
		cx.Durga();
				*/
		/*Category b=(Category)act.getBean("ca");
		b.test();
*/		
		CategoryCons ex=(CategoryCons)act.getBean("c");
		ex.test();
		}
}
