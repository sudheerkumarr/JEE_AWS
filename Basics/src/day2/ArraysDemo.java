/*
 * Arrays:
 *  to store more number of elements in a single variable
 *  supports all data types elements to store
 *  supports only homogeneous data types
 *  It uses contiguous memory space locations
 *  fixed in size
 *  better performance
 *  No predefined methods
 *  index based access
 *  index value start from 0
 *  find length - length
 *  
 *  Types of array
 *   Single Dimentional
 *     int[] arr1 = new int[5];
 *     int[] arr2 = {10, 20, 30, 40};
 *     int[] arr3 = new int[]{10, 20, 30, 40};
 *     
 *     // Declaring an array
 *     int[] arr4;
 *     int []arr5;
 *     int arr6[];
 *     
 *     System.out.println(arr5);//null
 *     System.out.println(arr4[1]); // Nullpointer exception
 *     
 *     // instantiation an array
 *     arr4 = new int[10];
 *     
 *     System.out.println(arr4);// Hashcode
 *     System.out.println(arr4[1]) ;// 0
 *     
 *     // initialization of an array
 *     
 *     arr4[0]=10;
 *     arr4[1]=20;
 *     arr4[3]=30;
 *     
 *     
 *     arr4.length ;//10
 *     
 *     arr4[1]=100;
 *     
 *     
 *     
 *     
 *     
 *   Multi dimentional
 *   
 */
package day2;

import java.util.Arrays;

public class ArraysDemo {

	// declaration
	// option 1
	static int[] i;
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {

		ArraysDemo ad = new ArraysDemo();
		
		// option2
		int[] arr2 = {10, 20, 30, 40};
		System.out.println(arr2[3]);
		
		// option3
		int[] arr3 = new int[]{10, 20, 30, 40};
		System.out.println(arr3[3]);
		
		
		System.out.println(i);  //null
		
		// Instantiation
		i = new int[5];
		
		System.out.println(i); //hashcode - [I@6504e3b2
		
		for(int v :i) {
			System.out.println(v);//0	
		}
		
		
		// Initialize
		i[0] = 100;
		i[1] = 200;
		i[4] = 400;
		
		for(int v :i) {
			System.out.println(v);//0	
		}
		
		
		//System.out.println(i[6]);//ArrayIndexOutOfBoundException
		
		
		Employee[] employees = new Employee[5];
		Employee emp1 = new Employee();
		emp1.empId=1001;
		emp1.name="Sai";
		
		Employee emp2 = new Employee(1002, "Ram");
		Employee emp3 = new Employee(1003, "Sam");
		
		employees[0]=emp1;
		employees[2]=emp2;
		employees[3]=emp3;
		System.out.println();
		// display all elements present in employees array
//		for(Employee e:employees) {
//			System.out.println(e); //hashcode, emp1, emp2..,
//		}
//		
		// display employee details alone without null
		for(Employee e:employees) {
			if(e!=null) {
				System.out.println(e);
			}
		}
		
		
		Student std1 = new Student(2001, "Jhon");
		Student std2 = new Student(2002, "Lucy");
		
		// Adding objects to Object Array
		Object[] objs = new Object[5];
		objs[0] = emp1;
		objs[1] = emp2;
		objs[3] = std1;
		objs[4] = std2;
		
		// Type of element
		System.out.println(objs[0].getClass().getName());//Employee
		System.out.println(objs[3].getClass().getName()); // Student
		
		// Retrieve values from Object Array
		for(Object obj: objs) {
			if(obj instanceof Employee) {
				Employee emp = (Employee)obj;
				System.out.print(emp.empId+" ");
				System.out.print(emp.name);
				System.out.println();
			} else if(obj instanceof Student) {
				Student std = (Student)obj;
				System.out.print(std.rollNo+" ");
				System.out.print(std.name);
				System.out.println();
			} else {
				System.out.println(obj);
			}
		}
		
		
		// java.util.Arrays
//		Arrays.sort();
//		Arrays.binarySearch();
//		Arrays.fill();
//		Arrays.copyOf();
//		Arrays.copyOfRange();
	
		for(int n:ad.m1(ad.arr)) {
			System.out.print(n+" ");
		}
		
		
		} // main method
	
	
	// square all numbers in array
	int[] m1(int[] arr) {
		int[] newArr = new int[arr.length];
		int index=0;
		for(int num:arr) {
			arr[index]= num*num;
			index++;
		}
		
		return arr;
	} // m1 method
		
	

}
