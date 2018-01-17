package com.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sm.entities.Student;
import com.sm.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/studentsList")
	public String getListofStudents(Model model){
		
		//get students from dao
		List<Student> students = studentService.getStudents();
		//add students to the spring model class
		model.addAttribute("students",students);
		return "StudentsList";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(){
		return "AddStudent";
	}
}
