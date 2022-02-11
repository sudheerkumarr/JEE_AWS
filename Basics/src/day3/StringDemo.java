/*
 * String : 
 *  sequence of charecters
 *  pkg - java.lang.String
 *  String are immutable
 *  
 *  ways to define string
 *  1. String literal
 *     String str1 = "Hello";
 *     String constant pool - inside Heap memory
 *     1.6 - class area
 *     1.7 - heap
 *      
 *      
 *  2. using new keyword
 *     String str2 = new String("Hello");
 *     Heap memory
 *     
 *  Memory Areas :
 *    Heap Area - Object
 *    Stack area - method data & partial result
 *               - threads will use stack area
 *    Program Counter Register -
 *        address of currently executing instructions
 *    Class Area
 *       variables, constants, methods, constructors
 *    Native method area
 *       - Meant for storing non native methods
 */
package day3;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// using string literals, objects will store in scp
		String str1 = "Java"; //scp
		String str2 = "Java"; // scp
		String str3 = "Program"; // scp
		String str4 = "java"; //scp
		

		System.out.println(str1.equals(str2)); //content - true
		System.out.println(str1==str2); //reference - true
		
		str1.concat("Program");
		System.out.println(str1); //Java
		
		//str1 = str1.concat("Program");
		//System.out.println(str1);//JavaProgram
		
		// Using new keyword, objects stored in heap
		String str5 = new String("Hello"); //heap
		String str6 = new String("Hello");
		String str7 = str5;
		
		
		// comparison
		// equals, ==, comparTo
		System.out.println(str1.equals(str2)); //content - true
		System.out.println(str1==str2); //reference - true 
		
		System.out.println();
		
		System.out.println(str5.equals(str6));//true
		System.out.println(str5==str6);// false
		
		System.out.println(str5.equals(str7));//true
		System.out.println(str5==str7);//true

		// compareTo - lexographically comparision
		// - 0 - equal, -1 - str1<str2, 1 - str1>str2
		
		
//		String str1 = "Java"; //scp
//		String str2 = "Java"; // scp
//		String str3 = "Program"; // scp
//		String str4 = "java"; //scp
		
		System.out.println(str1.compareTo(str2));//0
		System.out.println(str1.compareTo(str4));//-ve
		System.out.println(str4.compareTo(str1));// +ve
		
		
		// methods
		
		System.out.println(str1.length());//4
		System.out.println(str1.charAt(0)); //J
		System.out.println(str1.substring(1));//ava
		System.out.println(str1.substring(1,3));//a
		System.out.println(str1.contains("va"));
		System.out.println(str1.startsWith("J"));//true
		System.out.println(String.join(" ", str1, str3));
		String[] strings = str1.split("a");
		System.out.println(Arrays.toString(strings));
		for(String str:strings) {
			System.out.println(str);
		}
		System.out.println(str1.isEmpty());//false
		
		
		
		
		
		
	}

}
