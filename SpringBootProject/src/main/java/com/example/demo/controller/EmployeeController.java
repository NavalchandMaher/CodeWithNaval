package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/demo")
@CrossOrigin
public class EmployeeController {
	
	
	
	@Autowired
	EmployeeService empServices;
	
	//save emplyee
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee emp)
	{
		empServices.saveEmployee(emp);
	}
	
	
	//get all employee
	@GetMapping("/employee")
	public List<Employee> getAllemp()
	{
		return empServices.getAllEmployee();
	}
	
	
	//get employeeby employee id
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getSingleEmployee(@PathVariable Long id)
	{
		return empServices.getEmployeeById(id);
	}
	
	
	//delete Employee
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id)
	{
		empServices.deleteEmployee(id);
	}
	
	//Edit Employee
	
	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee emp)
	{
		empServices.saveEmployee(emp);
	}
	
	
}
