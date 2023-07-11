package com.sree.service;

import java.util.List;

import com.sree.entity.Student;

public interface StudentService {
	
	public void saveStudent(Student stu);
	public List<Student>getStudents();

}
