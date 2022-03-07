package com.example.repository;

import java.util.List;

import com.example.bean.Employee;

public interface IEmployeeRepository {
	Employee addEmployee(Employee employee);
	Employee deleteEmployeeById(int empId);
	Employee deleteEmployeeByName(String name);
	Employee deleteEmployee(Employee employee);
	Employee updateEmployee(int empId, Employee employee);
	Employee getEmployeeByName(String name);
	Employee getEmployeeById(int empId);
	List<Employee> getAllEmployee();

}
