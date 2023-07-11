package com.sree.repository;

import java.util.List;

import com.sree.entity.Student;

public interface StudentRepo {
	
	public void saveStudent(Student stu);
	public List<Student>getStudents();

}
