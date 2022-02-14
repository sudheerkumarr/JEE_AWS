/*
 * Basic principles in java
 *   1. Class
 *   2. Object
 *   3. Inheritance
 *   4. Polymorphism
 *   5. Abstraction
 *   6. Encapsulation
 *   
 *   Inheritance/IS-A
 *    Acquire properties & methods defined in parent class
 *    using 'extends' keyword, we can acquire parent class properties & methods
 *    Only one class can be extended
 *    Types
 *    ------
 *    Single        - Java
 *      Parent <--- Child
 *    Multiple   - Java won't support     
 *    Multilevel    - Java
 *      Parent <---- Child  <----- GrandChild
 *    Hierarchical  - Java 
 *      Parent <---- ChildA
 *             <-----ChildB
 *    Hybrid - Java won't support
 *    
 *   HAS-A Relationship
 *   
 *   
 *    Animal - DOG/Elephant - IS- A relationship
 *    Vehicle - Car/Scooter -IS-A relationship 
 *    
 *    Person - Address - HAS-A
 *    Person - Car - HAS-A
 *    Product-Cart - HAS-A
 *    Person-Card - HAS-A
 *    
 *     
 */
package day4;

public class InheritanceDemo {

	public static void main(String[] args) {
		// Without inheritance
		//Person
		Person person = new Person();
		int x= person.age;
		System.out.println(x);
		System.out.println(person.getAge());
		
		//Employee
		Employee emp = new Employee();
		System.out.println(emp.getEmpId());
		System.out.println(emp.salary);
		
		Student std = new Student();
		System.out.println(std.getAge());
		
		//==========================
		// Single - Person & Employee - ctrl+space - suggestion box
		// Case 1: reference type and object type is parent
		Person p = new Person(); // can able to access parent class members
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		
		//Case 2: reference type and object type is child - tight coupling
		Employee emp1 = new Employee(); // can able to access both parent & child members
		// Parent class members
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		
		// Child class members
		System.out.println(emp1.empId);
		System.out.println(emp1.salary);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getSalary());
		
		
		// Case 3: Reference type - Parent & Object type - Child
		// Runtime polymorphism - overriding - adv - 
		Person p1 = new Employee(); // compile time, compiler checks parent class methods and during runtime JVM excecutes child class method
		
		System.out.println(p1.getName());
		
		
		System.out.println(emp1.x);// 10/200
		
		// Case 4: reference type - parent & object type - Parent
		//Employee emp2 = new Person(); //invalid
		
		
		// Creating object
		Employee emp2  = new Employee(1001, 35000, "Ram", 23);
		
		System.out.println(emp2); //hashcode
		
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		
		System.out.println(emp2.address); //null
		System.out.println(emp2.car); //null
		//System.out.println(emp2.car.model); // NullPointerException
		
		Car c = new Car();
		c.model=2004;
		Employee emp3  = new Employee(1001, 35000, "Ram", 23, c);
		System.out.println(emp3.car); //hashcode
		System.out.println(emp3.car.model); //2004
		
		
		// multilevel inheritance & HAS-A relationship(Person & Address)
		
		
		
		
		
		

	}

}
