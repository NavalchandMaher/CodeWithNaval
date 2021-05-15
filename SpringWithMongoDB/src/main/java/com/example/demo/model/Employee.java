package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "employee")
public class Employee {

	
	@Id
	private String id;
	private String name;
	private String address;
	private String department;
	private Double salary;
	
}
