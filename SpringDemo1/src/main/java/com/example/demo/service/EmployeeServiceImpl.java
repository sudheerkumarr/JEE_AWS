package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.bean.Login;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.LoginDto;
import com.example.demo.exception.EmployeeNotFoundException;
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
		Optional<Employee> opt = empRepo.findById(id);
		if(!opt.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found with the given id: "+id);
		}
//		Employee emp = empRepo.getById(id);
//		if(emp==null) {
//			throw new EmployeeNotFoundException("Employee not fouud with the id "+id);
//		}
		return opt.get();
	}

	@Override
	public Employee getEmpByName(String name) {
		
		return empRepo.findByEmpName(name);
	}

	@Override
	public EmployeeDto addEmployee(Employee employee) {
		// Convert Employee to Employee Dto
		Employee emp = empRepo.save(employee);
		EmployeeDto empDto = new EmployeeDto();
		empDto.setEmpName(emp.getEmpName());
		empDto.setContactNo(emp.getContactNo());
		
		// convert Login to LoginDto
		Login login = emp.getLogin();
		LoginDto loginDto = new LoginDto();
		loginDto.setEmail(login.getEmail());
		loginDto.setLogin(login.isLogin());
		
		empDto.setLoginDto(loginDto);
		
		// return EmployeeDto
		return empDto;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// Check given emp is there in db or not
				
		Optional<Employee> opt = empRepo.findById(employee.getEmpId());
		if(!opt.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found with the given id: "+ employee.getEmpId());
		}
		return empRepo.save(employee);
		
	}

	@Override
	public Employee deleteEmpById(int id) {
		// Check given emp is there in db or not
		Optional<Employee> opt = empRepo.findById(id);
		if(!opt.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found with the given id: "+id);
		}
		// delete emp
		empRepo.deleteById(id);
		return opt.get();
		
	}

	@Override
	public Employee updateEmpByName(int empId, String name) {
		// Check given emp is there in db or not
				Employee emp = empRepo.getById(empId);
				// delete emp
				if(emp!=null) {
					emp.setEmpName(name);
					empRepo.save(emp);
					return emp;
				} else {
					return null;
				}		
		
	}

	@Override
	public Employee updateEmpSalary(int id, double salary) {
		
		return null;
	}

}
