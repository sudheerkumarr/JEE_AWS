package day2;

public class Employee {
	
	// Fields/Variables
	public int empId;
	public String name;
	
	
	// Constructors
	Employee() {
		
	}
	
	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}

	
	
	//
//	public java.lang.String toString() {
//		return this.empId+" "+ this.name;
//	}

	
}
