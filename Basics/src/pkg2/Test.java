package pkg2;

import pkg1.Employee;
import pkg1.JavaBasics;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		
		employee2.setAge(23);
		employee2.setName("Kavita");
		employee2.setRole("IT");;
		
		
//		Employee emp3 = new Employee("Ravi", 32, "HR", 35000.00);
//		Employee emp4 = new Employee("Jhon");
		JavaBasics javaBasics= new JavaBasics();
		
		System.out.println(javaBasics.skills); //null
		System.out.println(employee.name);//null
		
		employee.name="Ram";
		employee.age=21;
		employee.dept="HR";
		
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.dept);
		
		employee2.name="Sam";
		employee2.age=22;
		employee2.dept="IT";
		
		System.out.println();
		System.out.println(employee2.name);
		System.out.println(employee2.age);
		System.out.println(employee2.dept);
//		
//		System.out.println();
//		System.out.println(emp3.name);
//		System.out.println(emp3.age);
//		System.out.println(emp3.dept);
//		System.out.println(emp3.salary);
//		
//		
//		System.out.println(emp4.name); // Jhon
//		System.out.println(emp4.age);//0
//
//		System.out.println();
//		System.out.println(emp3.getRole());
//		emp3.setRole("Admin");
//		System.out.println(emp3.getRole());
//		
//		
//		Employee emp5 = new Employee("Krish", 23, "IT", 30000, "Software Engineer");
//		System.out.println(emp5.name);
//		System.out.println(emp5.age);
//		System.out.println(emp5.dept);
//		System.out.println(emp5.salary);
//		System.out.println(emp5.getRole());
//		emp5.setRole("Manager");
//		System.out.println(emp5.getRole());
		
		
		
	}

}
