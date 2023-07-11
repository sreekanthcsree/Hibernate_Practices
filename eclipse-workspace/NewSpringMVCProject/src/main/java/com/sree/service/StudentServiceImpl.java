package com.sree.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sree.entity.Student;
import com.sree.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	StudentRepo repo;

	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		repo.saveStudent(stu);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repo.getStudents();
	}

}
