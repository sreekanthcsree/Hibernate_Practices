package com.sree;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDAO {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void sree(Student s) {
		String q="insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getLocation()+"')";
		template.execute(q);		
	}
}
