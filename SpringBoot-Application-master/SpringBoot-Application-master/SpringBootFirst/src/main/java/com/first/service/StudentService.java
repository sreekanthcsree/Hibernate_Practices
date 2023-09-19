package com.first.service;

import com.first.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student findById(int id) throws Exception;
    public Student deleteById(int id) throws Exception;
    public Optional<Student> findByName(String studentName) throws Exception;


}
