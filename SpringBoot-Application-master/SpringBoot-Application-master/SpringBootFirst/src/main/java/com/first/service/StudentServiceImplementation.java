package com.first.service;

import com.first.entity.Student;
import com.first.exceptions.StudentIdNotFoundException;
import com.first.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> listOfStudents = studentRepository.findAll();
        return listOfStudents;
    }

    @Override
    public Student saveStudent(Student student) {
        Student std = studentRepository.save(student);
        return std;
    }

    public Student findById(int id) throws Exception{
        Optional<Student> studentOptional = studentRepository.findById(id);
            if(studentOptional != null){
                return studentOptional.get();
            }else{
                throw new StudentIdNotFoundException("please enter the correct student ID");
            }
    }

    public Student deleteById(int id) throws Exception{
        Student std = findById(id);
        studentRepository.deleteById(id);
        return std;
    }
    public Optional<Student> findByName(String stuName) throws Exception{
        Optional<Student> studentOptional = studentRepository.findByName(stuName);
        if(studentOptional != null){
            return studentOptional;

        }else{
            throw new StudentIdNotFoundException("please enter the correct student Name");
        }
    }
}
