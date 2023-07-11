package com.sree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sree.entity.Student;
import com.sree.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	public void setService(StudentService service) {
		this.service = service;
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveStudent(Student stu) {
		
		System.out.println("Student firstname : "+stu.getfName()+" Lastname : "+stu.getlName());
		System.out.println("Email : "+stu.getEmail()+" Mobile Number : "+stu.getMno());
		//v.addObject("det", details);
		return new ModelAndView("index","details","Record Saved Successfully");
	}
	@RequestMapping(value="/getInfo",method=RequestMethod.GET)
	public ModelAndView getStudentInfo() {
		List<Student>list=service.getStudents();
		return new ModelAndView("StudentList","list",list);
		
	}
}

