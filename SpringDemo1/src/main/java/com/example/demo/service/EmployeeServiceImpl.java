package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		return empRepo.getById(id);
	}

	@Override
	public Employee getEmpByName(String name) {
		
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// Check given emp is there in db or not
		// update emp details
		return null;
	}

	@Override
	public Employee deleteEmpById(int id) {
		// Check given emp is there in db or not
		Employee emp = empRepo.getById(id);
		// delete emp
		empRepo.deleteById(id);
		return emp;
	}

	@Override
	public Employee updateEmpByName(String name) {
		
		return null;
	}

	@Override
	public Employee updateEmpSalary(int id, double salary) {
		
		return null;
	}

}
