package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	
	
	
	
	
	//JPQL Query
	
//	@Query(value = "from Student  where name=?1")
//	public List<Student> getByName(String  name);
//	
	
	//Native Query
	/*
	 * @Query(value = "select * from student  where name=?1",nativeQuery = true)
	 * public List<Student> getByName(String name);
	 * 
	 */// method keyword
	
	public List<Student> findByName(String name);
	
//	public List<Student> findByNameAndCourse(String name,String course);
//	
//	
	
//	@Query(value = "from Student where name=?1 and course=?2")
//	public List<Student> getByNameAndCourse(String name, String course);
//	

	
	@Query(value = "select * from student where name=?1 and course=?2",nativeQuery = true)
	public List<Student> getByNameAndCourse(String name, String course);
	
	@Modifying
	@Query(value = "insert into student(name,course,age)values(?1,?2,?3)",nativeQuery = true)
	@Transactional
	public void insertStudent(String name, String course, int age);

//	@Modifying
//	@Query(value = "update Student set name=?1, age=?2 where course=?3")
//	@Transactional
//	public void updateStudent(String name,int age, String course);
//	
	
	@Modifying
	@Query(value = "update student set name=?1, age=?2 where course=?3",nativeQuery = true)
	@Transactional
	public void updateStudent(String name,int age, String course);
	
	
	//delete student
	
	@Modifying
	@Query(value = "delete Student where name=?1")
	@Transactional
	public void deleteStudent(String name);
	
	
	
	
}
