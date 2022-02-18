package day8;

import java.util.Objects;

public class Employee  implements Comparable<Employee>{
	
	// Fields
	int empId;
	String empName;
	
	
	// Contructors
	Employee() {}
	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public int compareTo(Employee obj) {
		return obj.empName.compareTo(this.empName);
	}
	
	

}
