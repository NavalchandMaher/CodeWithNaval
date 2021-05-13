package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Task;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServices {

	@Autowired
	EmployeeRepo employeeRepo;
	
	// insert employee
	public Employee insertEmployee(Employee emp)
	{
		for(Task task : emp.getTask())
		{
			task.setEmployee(emp);
		}
		emp.setTask(emp.getTask());
		
		return employeeRepo.save(emp);
	}
	
	//get all employee
	public List<Employee> getAllEmployee()
	{
		return employeeRepo.findAll();
	}
	
	
	//get employee by id
	
	public Optional<Employee> getByIdEmployee(Long id)
	{
		return employeeRepo.findById(id);
	}
	
	
	//delete record
	public void deleteEmployeeById(Long id)
	{
		employeeRepo.deleteById(id);
	}
	
	
}
