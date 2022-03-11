package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Employee;
import com.example.demo.dto.EmployeeDto;

public interface IEmployeeService {
	// get all employees
	List<Employee> getAllEmployees();
	//get emp based on id
	Employee getEmpById(int id);
	// get emp based on name
	Employee getEmpByName(String name);
	// add emp
	EmployeeDto addEmployee(Employee employee);
	// update employee
	Employee updateEmployee(Employee employee);
	// delete employee
	Employee deleteEmpById(int id);
	// update emp name
	Employee updateEmpByName(int empId, String name);
	// update emp salary
	Employee updateEmpSalary(int id, double salary);
	
}
