/*
 * Mobile Apps
 * Desktop/Standalone Applications
 * Web Applications 
 * Enterprise Applications - Banking applications
 * 
 * Java Editions 
 * Java SE - Desktop
 * Java EE - Web/Enterprise
 * Java ME - Mobile
 * Java JFX - Internet applications
 * 
 * Java 1.0 - 1995
 * Java 8 - 2014
 * Java 17 - latest version
 * 
 * Identifiers : names given for classes , interfaces, methods etc.,
 *  rules - 
 *    class/interface - UpperCamelCase
 *    methods/variable - lowerCamelCase
 *    packages - lowercase 
 *    constants - UPPERCASE
 *    
 *    lower/uppercase alphabets, numbers, _, $
 *    starting letter shouldn't be number
 *    
 *    Variable - 
 *     Instance Variables - define inside class, using object reference we can access
 *     Local Variables - define inside method, can't access from other methods/classes
 *     Static Variables -define inside class, using class name/object reference we can access
 *     
 *    Data types - 
 *      Primitive data type - 8
 *       byte - 128
 *       short
 *       int - 
 *       long
 *       float -0.0f
 *       boolean - true/false
 *       double - 0.0
 *       char- 'c'
 *      non primitive data types
 *        String - "Hello"
 *        Array
 *        null
 *
 *  Statement order inside source/class file
 *    package stmt should be in first line
 *    import statements
 *    class definition
 *    variables
 *    Constructor
 *    static/instance block
 *    methods
 *    comments can be anywhere
 *    
 *    Access modifiers - controls level of access
 *     1. public - any where
 *     2. private - within class
 *     3. protected - within same package and child classes from other packages
 *     4. default - within class & same package  
 */
 
 // single line comments

 /*
  * Multiline comment
  */

/*
 * Employee- 
 *   fname, lname, email, ph, address
 *   read, write, talk
 *   
 *   ecommerce app-
 *     customer, product, payment, admin, card, cart, address
 */
package pkg1;

public class JavaBasics {

	//instance variables
	String name;
	short age;
	double salary;
	boolean isAvailable;
	
	// static variables
	public static String[] skills;

	
	// default values;
	byte b; //0
	short s; //0
	int i; //0
	long l; //0
	float f; //0.0f
	double d; //0.0
	boolean bool; //false
	char c; // /u0000
	String str; // null
	int[] arr; //null
	//Employee emp; //null
	
	// method
	// returnType methodName(input args) {}

	Employee emp = new Employee();
	

	// static method
	public static void main(String []args) {
		
		Employee emp = new Employee();
		
		
		
		// local variable
		double d1 = 100.123;
		// create object 
		JavaBasics javaBasics = new JavaBasics();
		
		// Accessing static varibles
		//System.out.println(skills);
		//System.out.println(JavaBasics.skills);
		System.out.println(javaBasics.skills);
		
		// Access Non static/instance variables can be accessed using object reference from static area
		System.out.println(javaBasics.name);
		System.out.println(javaBasics.age);
		System.out.println(javaBasics.add("Ram"));

		// Access local variables
		System.out.println(d1);
	}
	
	
	// non static/instance method
	String add(String name) {
		// Local variable
		String str = "Hello";
		return str+" "+name; //Hello Sai
	}
	
	void m1() {
		// both static and instance members can be access without object reference from instance area.
		System.out.println(name);
		System.out.println(skills);
	}

}
