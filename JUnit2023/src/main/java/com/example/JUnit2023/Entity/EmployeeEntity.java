package com.example.JUnit2023.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity(name="employee")
public class EmployeeEntity implements Serializable{
	
	private static final long serialVersionUID = -8373306340538310635L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private long salary;
	
	
	
}


