package day4;

public abstract class Car {
	
	int model;
	
	// abstract method
	public abstract void m1();
	
	// concrete method
	void m2() {
		System.out.println("Car m2() method");
	}

}
