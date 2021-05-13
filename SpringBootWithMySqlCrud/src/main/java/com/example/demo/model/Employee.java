package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	
	
	/*
	
	//Unidirectional
	
	//OneOtOne 
	@OneToOne(cascade = CascadeType.ALL ,orphanRemoval = true)
	@JoinColumn(name = "profile_id",referencedColumnName="id")
	private Profile profile; 
	
	
	
	//many to one
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",referencedColumnName="id")
	private Department department;
	
	
	
	//OneToMany
	@OneToMany(cascade = CascadeType.ALL ,orphanRemoval = true)
	@JoinColumn(name = "employee_id",referencedColumnName="id")
	private List<Task> task;
	
	
	//ManyToMany
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;
	
	
	*/
	
	
	// Bidirectional
	
	//One To One 
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "profile_id",referencedColumnName = "id")
	private Profile profile;
	
	
	
	//Many To One
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id",referencedColumnName = "id")
	private Department department;
	
	
	
	// one to many
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	private List<Task> task;
	
	
	//many to many
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;
	
}
