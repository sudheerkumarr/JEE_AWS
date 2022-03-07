package com.example.service;

import java.util.List;

import com.example.bean.Employee;
import com.example.repository.EmployeeRepositoryImpl;
import com.example.repository.IEmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService {
	
	IEmployeeRepository empRepo = new EmployeeRepositoryImpl();

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = empRepo.addEmployee(employee);
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		return empRepo.deleteEmployeeById(empId);
	}

	@Override
	public Employee deleteEmployeeByName(String name) {
		
		return empRepo.deleteEmployeeByName(name);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public Employee updateEmployee(int empId, Employee employee) {
			
		Employee emp = empRepo.updateEmployee(empId, employee);	
		
		return emp;
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return empRepo.getEmployeeByName(name);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee emp = empRepo.getEmployeeById(empId);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList= empRepo.getAllEmployee();
		return empList;
	}

}
