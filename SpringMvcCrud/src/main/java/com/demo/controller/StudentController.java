package com.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Student;
import com.demo.service.StudentServices;

@Controller
@RequestMapping
public class StudentController {

	
	@Autowired
	StudentServices studentService;
	
	@GetMapping("/studentReport")
	public String studentReport()
	{
		
		return "StudentReport";
	}
	
//	
//	
//	@GetMapping("/date")
//	@ResponseBody
//	public String getTime()
//	{
//		Date date=new Date();
//		
//		return String.valueOf(date);
//	}
//	
	
	@PostMapping("/insertStudent")
	@ResponseBody
	public String saveStudent(@ModelAttribute("insertStudent") Student std)
	{
		studentService.saveStudent(std);
		return "saved";
	}
	
	
	
	@GetMapping("/getAllStudent")
	public @ResponseBody List<Student> getAllStudent()
	{
		List<Student> ss=studentService.getAllStudent();
		
		return ss;
	}
	
	
	@GetMapping("/getOneStudent/{id}")
	@ResponseBody
	public Student getById(@PathVariable Long id)
	{
		return studentService.getById(id);
	}
	
	
	@PostMapping("/updateStudent")
	@ResponseBody
	public String updateStudent(@ModelAttribute("updateStudent") Student std)
	{
		studentService.updateStudent(std);
	
	return "updated";
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
		
		return "deleted";
	}
	
	
	
}
