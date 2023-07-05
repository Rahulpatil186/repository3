package com.example.JUnit2023.rest;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class EmployeeRest {

	private long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private long salary;
	
}
