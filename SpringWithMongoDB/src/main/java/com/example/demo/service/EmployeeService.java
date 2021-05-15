package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo emplyeeRepo;
	
	//add employee
	public void addEmployee(Employee emp)
	{
		
		emplyeeRepo.save(emp);
	}
	
	
	//get all employee
	
	public List<Employee> getAllEmployee()
	{
		
		return emplyeeRepo.findAll();
		
	}
	
	//get by id employee
	
	public Optional<Employee> getByIdEmployee(String id)
	{
		return emplyeeRepo.findById(id);
	}
	
	
	// update employee
	public void updateEmployee(Employee emp)
	{
		 emplyeeRepo.save(emp);
	}
	
	
	/// delete employee
	
	public void deleteEmployee(String id)
	{
		emplyeeRepo.deleteById(id);
	}
	
	
	
	
	
}
