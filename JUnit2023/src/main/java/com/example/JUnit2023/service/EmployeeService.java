package com.example.JUnit2023.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JUnit2023.request.EmployeeReqs;
import com.example.JUnit2023.rest.EmployeeRest;


public interface EmployeeService {

	List<EmployeeRest> getEmployees();

	EmployeeRest addEmployee(EmployeeReqs employeeReqs);

	EmployeeRest updateEmployee(EmployeeReqs employeeReqs);

	void deleteEmployee(long id);

}
