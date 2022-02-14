package day4;

public class Person {
	
	String name;
	int age;
	int x= 10;
	
	// HAS-A relationship
	Address address;
	Car car;
	
	// constructors
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	// methods
	String getName() {
		System.out.println("Person getName() method");
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
//	void m1() {
//		System.out.println("Person class m1() method");
//	}

}
