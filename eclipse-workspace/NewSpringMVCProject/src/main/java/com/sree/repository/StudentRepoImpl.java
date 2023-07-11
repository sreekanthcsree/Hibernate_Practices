package com.sree.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sree.entity.Student;

@Repository
public class StudentRepoImpl implements StudentRepo{
	
	@Autowired
    HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
	      this.template = template;
    }

	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		template.save(stu);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student>slist=template.loadAll(Student.class);
		return slist;
	}
}
