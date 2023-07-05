package com.example.JUnit2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JUnit2023.request.EmployeeReqs;
import com.example.JUnit2023.rest.EmployeeRest;
import com.example.JUnit2023.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping()
	private List<EmployeeRest> getAllEmployees() {
		List<EmployeeRest> returnValue = employeeService.getEmployees();
		return returnValue;
	}

	@PostMapping()
	private ResponseEntity<?> addEmployee(@RequestBody EmployeeReqs employeeReqs) {
		EmployeeRest employeeRest = employeeService.addEmployee(employeeReqs);
		return new ResponseEntity<>(employeeRest, HttpStatus.OK);
	}

	@PutMapping()
	private ResponseEntity<?> updateEmployee(@RequestBody EmployeeReqs employeeReqs){
		EmployeeRest employeeRest= employeeService.updateEmployee(employeeReqs);
		return new ResponseEntity<>(employeeRest,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	private void deleteEmpoyee(@PathVariable long id) {
		employeeService.deleteEmployee(id);
		
	}
}
