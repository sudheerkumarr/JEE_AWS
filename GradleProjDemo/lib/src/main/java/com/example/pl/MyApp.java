package com.example.pl;

import java.util.List;
import java.util.Scanner;

import com.example.bean.Employee;
import com.example.service.EmployeeServiceImpl;
import com.example.service.IEmployeeService;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1000;
		
		IEmployeeService empServ = new EmployeeServiceImpl();

		System.out.println("Select option from below: ");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee By Id");
		System.out.println("4. Search Employee By Id");
		System.out.println("5. Search Employee By Name");
		System.out.println("6. Get All Employees");
		System.out.println("7. Delete Employee By Name");
		System.out.println("8. Delete Employee By Employee Obj");
		
		int selectedOption = sc.nextInt();
		
		// byte, short, int, String, Enum, Wrapper objects
		switch(selectedOption) {
		case 1:
			System.out.println("Enter employee name");
			String empName = sc.next();
			System.out.println("Enter employee salary");
			double empSalary = sc.nextDouble();
			System.out.println("Enter employee designation");
			String empDesignation = sc.next();
			
			// create emp obj and update properties using constructor
//			Employee emp = new Employee(++id, empName, empSalary, empDesignation);
//			System.out.println(emp);
//			Employee newEmp = empServ.addEmployee(emp);
//			System.out.println("Added "+newEmp.getName()+" successfully!");
		
			// Create emp obj and update properties using setter methods
			Employee emp = new Employee();
			emp.setName(empName);
			emp.setSalary(empSalary);
			emp.setDesignation(empDesignation);
			
			Employee newEmp = empServ.addEmployee(emp);
			System.out.println(newEmp);
			System.out.println("Added "+newEmp.getName()+" successfully!");	
			
			break;
		case 2:
			// get input from user
			System.out.println("Enter employee id");
			int eId = sc.nextInt();
			System.out.println("Enter employee name");
			String eName = sc.next();
			System.out.println("Enter employee salary");
			double eSalary = sc.nextDouble();
			System.out.println("Enter employee designation");
			String eDesignation = sc.next();
		
			// create emp 
			Employee updateEmp = new Employee();
			
			// Update emp details
			updateEmp.setName(eName);
			updateEmp.setSalary(eSalary);
			updateEmp.setDesignation(eDesignation);
			
			// call service method to update emp details
			Employee uEmp= empServ.updateEmployee(eId, updateEmp);
			System.out.println(uEmp);
			
			break;
		
		case 3:
			System.out.println("Enter employee id to delete");
			int dEmpId= sc.nextInt();
			Employee deletedEmp = empServ.deleteEmployeeById(dEmpId);
			System.out.println("Deleted "+deletedEmp.getName()+" successfully!");
			break;
		
		case 4:
			// search emp based on id
			System.out.println("Enter employee id");
			int searchId = sc.nextInt();
			Employee searchEmp = empServ.getEmployeeById(searchId);
			System.out.println(searchEmp);
			
			break;
		
		case 5:
			System.out.println("Enter employee name to search");
			String searchName= sc.next();
			List<Employee> sEmp = empServ.getEmployeeByName(searchName);
			System.out.println(sEmp);
			break;
		
		case 6:
			// Get all employees
			List<Employee> empList = empServ.getAllEmployees();
			System.out.println(empList);
			for(Employee e:empList) {
				System.out.println(e);
			}
			break;
		
		case 7:
			System.out.println("Enter employee name to delete");
			String e = sc.next();
			Employee emp1 = empServ.deleteEmployeeByName(e);
			System.out.println(emp1.getName()+" deleted successfully!");
			break;
			
		case 8:
			break;
		default:
				System.out.println("Enter any number between 1-8");
		
		}
		
	}

}
