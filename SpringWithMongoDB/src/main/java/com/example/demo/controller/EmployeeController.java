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
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/demo")
@CrossOrigin
public class EmployeeController {

	
	
	
	
	@Autowired
	EmployeeService employeeService;
	
	//save employee
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee emp)
	{
			employeeService.addEmployee(emp);
	}
	
	
	//get all employee
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	//get employee by id
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id)
	{
		return employeeService.getByIdEmployee(id);
	}
	
	//update employee
	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee emp)
	{
		employeeService.updateEmployee(emp);
		
	}
	
	
	//delete Employee
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		employeeService.deleteEmployee(id);
	}
	
	
	
	
	
	
	
	
}
