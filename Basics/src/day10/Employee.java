package day10;

public class Employee {
	
	int empId;
	String empName;
	
	// Constructors
	Employee() {
		System.out.println("Inside No-Arg constructor");
	}
	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

}
