package com.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sm.dao.StudentDAO;
import com.sm.entities.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("/studentsList")
	public String getListofStudents(Model model){
		
		//get students from dao
		List<Student> students = studentDAO.getStudents();
		//add students to the spring model class
		model.addAttribute("students",students);
		return "StudentsList";
	}
}
