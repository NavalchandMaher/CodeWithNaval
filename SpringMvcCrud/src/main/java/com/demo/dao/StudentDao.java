package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Student;

@Component
public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	
	//save student
	@Transactional
	public void saveStudent(Student std)
	{
		hibernateTemplate.save(std);
	}
	
	
	//get all Student
	
	public List<Student> getAllStudent()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
	
	
	//get student by id
	
	public Student getById(Long id)
	{
		return hibernateTemplate.get(Student.class, id);
	}
	
	//update student
	@Transactional
	public void updateStudent(Student std)
	{
		hibernateTemplate.update(std);
	}
	
	//delete student
	@Transactional
	public void deleteStudent(Long id)
	
	{
		hibernateTemplate.delete(hibernateTemplate.get(Student.class, id));
	}
	
	
	
	
	
	
}



