package com.example.JUnit2023.request;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class EmployeeReqs {

	private long id;
	private String firstName;
	private String lastName;
	private Date dob;
	private long salary;
}
