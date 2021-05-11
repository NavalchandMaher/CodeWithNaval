package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Component
@Service
public class StudentServices {

	
	@Autowired
	StudentDao studentDao;
	
	
	//save student
	public void saveStudent(Student std)
	{
		studentDao.saveStudent(std);
	}
	
	
	//getallstudet
	public List<Student> getAllStudent()
	{
		return studentDao.getAllStudent();
	}
	
	
	//get by id 
	
	public Student getById(Long id)
	{
		return studentDao.getById(id);
	}
	
	//update student
	
	public void updateStudent(Student std)
	{
		studentDao.updateStudent(std);
	}
	//delete Student
	
	public void deleteStudent(Long id)
	{
		studentDao.deleteStudent(id);
	}
	
}
