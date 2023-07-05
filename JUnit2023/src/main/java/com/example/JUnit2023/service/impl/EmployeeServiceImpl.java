package com.example.JUnit2023.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JUnit2023.Entity.EmployeeEntity;
import com.example.JUnit2023.repository.EmployeeRepository;
import com.example.JUnit2023.request.EmployeeReqs;
import com.example.JUnit2023.rest.EmployeeRest;
import com.example.JUnit2023.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeRest> getEmployees() {
		ModelMapper modelMapper = new ModelMapper();
		List<EmployeeRest> employeeRests = new ArrayList<>();
		List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
		employeeEntities.forEach(o -> employeeRests.add(modelMapper.map(o, EmployeeRest.class)));
		return employeeRests;
	}

	@Override
	public EmployeeRest addEmployee(EmployeeReqs employeeReqs) {
		ModelMapper modelMapper = new ModelMapper();
		EmployeeEntity employeeEntity = modelMapper.map(employeeReqs, EmployeeEntity.class);
		employeeEntity = employeeRepository.save(employeeEntity);
		EmployeeRest employeeRest = modelMapper.map(employeeEntity, EmployeeRest.class);
		return employeeRest;
	}

	@Override
	public EmployeeRest updateEmployee(EmployeeReqs employeeReqs) {
		ModelMapper modelMapper=new ModelMapper();
		EmployeeEntity employeeEntity= modelMapper.map(employeeReqs, EmployeeEntity.class);
		employeeRepository.save(employeeEntity);
		return modelMapper.map(employeeEntity,EmployeeRest.class);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		
	}

}
