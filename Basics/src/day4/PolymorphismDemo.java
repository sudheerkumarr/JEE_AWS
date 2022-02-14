/*
 * Polymorphism -
 *  compile time/static/earlybinding polymorphism
 *   constructor overloading
 *   method overloading
 *   operator overloading - java won't support
 *  runtime time/dynamic/lateby binding polymorphism
 *    method overriding
 */
package day4;

public class PolymorphismDemo {

	// fields
	int x;
	int y;
	
	// Constructor Overloading
	PolymorphismDemo() {}
	PolymorphismDemo(int x, int y) {
		this.x= x;
		this.y=y;
	}
	PolymorphismDemo(int x) {
		this.x= x;
	}
	
	
	public static void main(String[] args) {
		PolymorphismDemo pd = new PolymorphismDemo();
		System.out.println(pd.add(10.1f, 30.03f));
		System.out.println(pd.add(10,20));
		
		System.out.println(10+20); // 30
		System.out.println("Hello"+" "+"World");
		
		// m1() present in Person & Student class
		//Person p = new Student();
		//p.m1(); //Student class m1() method
		

		// m1() present in Person class only
		//Person p = new Student();
		//p.m1(); //Person class m1() method
		
		// m1() present in Student class only
		Person p = new Student();
		//p.m1(); //compiler error
		

	}
	
	// method overloading
	int add(int x, int y) {
		return x+y;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	
	float add(float f1, float f2) {
		return f1+f2;
	}
	
	float add(float f1, int z) {
		return f1+z;
	}
	
	

}
