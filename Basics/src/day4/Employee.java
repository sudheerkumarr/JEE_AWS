package day4;

public class Employee extends Person{ // public, default, final, abstract, strictfp
	
	// Fields
	int empId;
	double salary;
	int y = 100;
	//int x = 200;
	
	// Constructors
	public Employee() {}
	public Employee(int empId, double salary, String name, int age) {
		super(name, age);
		this.empId = empId;
		this.salary= salary;
		
	}
	
	
	public Employee(int empId, double salary, String name, int age, Car car) {
		super(name, age, car);
		this.empId = empId;
		this.salary = salary;
	}
	// methods
	double getSalary() {
		return salary;
	}
	
	

	int getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

//	String getName() {
//		System.out.println("Employee getName() method");
//		return "";
//	}
	
	
}
