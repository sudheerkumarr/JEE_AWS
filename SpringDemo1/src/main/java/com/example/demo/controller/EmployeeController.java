package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService empServ;
	
	// get all employees
	@GetMapping("/employees")
	List<Employee> getAllEmployees() {
		return empServ.getAllEmployees();
	}
	// get emp based on id
	//@GetMapping("/employees/{id}")
	
	// get emp based on name
	// add emp
	// update employee
	// delete employee
	// update emp name
	// update emp salary
}
