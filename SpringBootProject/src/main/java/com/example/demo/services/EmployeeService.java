package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	//save employee
	
	public void saveEmployee(Employee emp)
	{
		
		employeeRepo.save(emp);
	}
	
	//get all employee
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepo.findAll();
	}
	
	
	
	//get Employee by Employee Id
	
	public Optional<Employee> getEmployeeById(Long id)
	{
		return employeeRepo.findById(id);
	}
	
	
	//delete employee by employee id
	
	public void deleteEmployee(Long id)
	{
		employeeRepo.deleteById(id);
	}
	
	
	
	
	

}
