package com.first.controller;


import com.first.entity.Student;
import com.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/all")
    public List<Student>  getAll(){
        return studentService.getAllStudents();
    }
    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody Student student){
       return studentService.saveStudent(student);
    }
    @GetMapping("/{studentID}")
    public Student findById(@PathVariable int studentID) throws Exception{
        return studentService.findById(studentID);
    }
    @DeleteMapping("/{studentId}")
    public Student deleteById(@PathVariable int studentId) throws Exception{
        return studentService.deleteById(studentId);
    }
    @GetMapping("/")
    public Optional<Student> findByName(@RequestParam String studentName)throws Exception{
        return studentService.findByName(studentName);
    }
}
