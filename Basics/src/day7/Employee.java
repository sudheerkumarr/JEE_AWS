package day6;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	// Fields
	long empId;
	String name;
	
	// Constructor
	public Employee() {
		
	}
	public Employee(long empId, String name) {
		this.empId = empId;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	// Override equals() & hashCode() method to compare objects based on empId & name
	@Override
	public int hashCode() {
		return Objects.hash(empId, name);
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
		return empId == other.empId && Objects.equals(name, other.name);
	}
	// Sorting based on empId
//	@Override
//	public int compareTo(Employee obj) {
//		if(this.empId>obj.empId) {
//			return 1;
//		} else if(this.empId<obj.empId) {
//			return -1;
//		} else {
//			return 0;
//		}
//  }
	

	// Sorting based on employee name - Asc
//	@Override
//	public int compareTo(Employee obj) {
//		return this.name.compareTo(obj.name); // this.name>obj.name - +ve
//		                                      // this.name<obj.name - -ve
//		                                      // this.name==obj.name - 0
//	}
	
	// Sorting based on employee name - desc
	@Override
	public int compareTo(Employee obj) {
		return obj.name.compareTo(this.name);
											   // this.name>obj.name - -ve
		                                      // this.name<obj.name - +ve
		                                      // this.name==obj.name - 0
	}
}
