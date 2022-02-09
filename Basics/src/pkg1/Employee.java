package pkg1;

public class Employee {
	public String name;
	public int age;
	public String dept;
	public double salary;
	private String role;
	
	// Default constructor/ no arg constructor
	public Employee() {}
	
	// Constructor Overloading
	// parameterized constructor
	public Employee(String name, int age, String dept, double salary) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
	public Employee(String name, int age, String dept, double salary, String role) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.role = role;
	}

	public Employee( int age, String dept, double salary) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
			
	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Employee(String name) {
		this.name=name;
	}
	
	// Getters & Setters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	// Setters
	public void setName(String n) {
		this.name = n;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

	

}
