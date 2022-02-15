/*
 * Wrapper Classes:
 * 
 * * Primitive data type to Object type - Wrapper classes
 * Collections
 * Serialization 
 * Cloning 
 * java.lang
 *   Integer   - int
 *   Float     - float
 *   Double    - double
 *   Long      - long
 *   Short     - short
 *   Byte      - byte
 *   Character - char
 *   Boolean   - boolean
 * 
 * Converting primitive to Object - 
 *  1. constructor
 *  2. valueOf() - method
 *  
 * Converting Object to Primitive
 *  xxxValue() - xxx - premitive data type
 *  ex:
 *  intValue()
 *  floatValue()
 *  doubleValue()
 *  
 *  Converting Wrapper Obj to String
 *  - toString()
 * 
 * Converting String to Wrapper Obj
 *   - valueOf()
 * 
 * 
 *  Primitive to String 
 *	 - valueOf()
 *	
 *	String to primitive data types
 *	 -  parseInt(), parseDouble()
 *  

 */

package day5;

public class WrapperDemo {

	public static void main(String[] args) {

		// Converting primitive to Object type - valueOf()/AutoBoxing/Constructor
		int x = 10; 
		Integer i1= new Integer(x);
		System.out.println(i1); // 10
		System.out.println(i1.getClass().getName());//Integer
		
		// Case 2:
		Integer i2 = Integer.valueOf(x);
		System.out.println(i2);//10
		System.out.println(i2.getClass().getName());//Integer
		
		// Case 3:
		Integer i3 = x; // AutoBoxing
		System.out.println(i3.getClass().getName());
		
		Float f1 = 10.54f;
		System.out.println(f1.getClass().getName()); // Float
		
		
		// Convert Object to primitive Type - xxxValue()/AutoUnboxing
		// Case 1
		float f2 = f1; // AutoUnboxing
		
		// Case 2
		float f3 = f1.floatValue();
		
		
		//Converting Wrapper Obj to String  - toString()
		System.out.println();
		
		Integer i4= new Integer(100);
		System.out.println(i4.getClass().getName()); // Integer
		
		String str = i4.toString();
		System.out.println(str.getClass().getName()); // String
		
		
		// Converting String to Wrapper Obj - wrapper class valueOf()
		System.out.println();
		String str1 = "10";
		System.out.println(str1.getClass().getName()); //String
		Integer i5= Integer.valueOf(str1);
		System.out.println(i5.getClass().getName()); // Integer
		
		// Primitive to String - valueOf()
		System.out.println();
		int y = 100;
		String str2 = String.valueOf(y);
		System.out.println(str2.getClass().getName());
		 
		// String to primitive data types -  parseInt(), parseDouble()
		int z = Integer.parseInt(str2);
		
		System.out.println();
		System.out.println((char)97); // a
		System.out.println((int)'a'); // 97
		System.out.println((int)'7'-(int)'0');// 55
		
		
	}

}
