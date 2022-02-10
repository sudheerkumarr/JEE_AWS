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

public class ArraysDemo {

	// declaration
	// option 1
	static int[] i;	
	public static void main(String[] args) {

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
	}

}
