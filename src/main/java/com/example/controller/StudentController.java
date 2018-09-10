package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.daomapper.StrudentMapper;
import com.example.models.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StrudentMapper studentmapper;
	
	@RequestMapping("/demo")
	public Student get () {
		Student student = studentmapper.getStudentByID(1);
		return student;
	}
	
	@RequestMapping(value = "res")
	public String df () {
		return "Hello";
	}
}
