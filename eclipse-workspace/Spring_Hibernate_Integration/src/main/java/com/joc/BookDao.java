package com.joc;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class BookDao {
	
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public void sreeBook() {
		Book b=new Book();
		b.setB_id(123);
		b.setB_name("Aptitude");
		b.setPrice(500);
		template.save(b);
		System.out.println("Record successfully inserted ");
	}
	public void getBookDetails() {
		List<Book>blist=template.loadAll(Book.class);
		blist.forEach(
				(x)->System.out.println("Book Id: "+x.getB_id()+"Book Name : "+x.getB_name()+"Price : "+x.getPrice())
				);	
	}
	public void updateBookDetails() {
		Book b=template.get(Book.class, new Integer(158));
		b.setB_name("Black Book");
		template.update(b);
		System.out.println("Updated successfully.......!");
	}
	public void deleteRecord() {
		Book bs=template.get(Book.class,new Integer(765));
		template.delete(bs);
		System.out.println("Deleted One Row Successfully....!");
	}
}
