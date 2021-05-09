package com.example.demo.contoller;

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
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping("/org")
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;
	
	//add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) 
	{
		return employeeServices.insertEmployee(emp);
		
	}
	
	//get all data 
	@GetMapping("/employee")
	public List<Employee> getAlldata()
	{
		return employeeServices.getAllEmployee();
	}
	
	
	//get employee by id
	@GetMapping("/employee/{id}")
	public Optional<Employee> getByid(@PathVariable Long id)
	{
		return employeeServices.getByIdEmployee(id);
	}
	
	//update employee
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return employeeServices.insertEmployee(emp);
	}
	
	//delete employee
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable Long id)
	{
		employeeServices.deleteEmployeeById(id);
		
		return "deleted";
	}
	

}
