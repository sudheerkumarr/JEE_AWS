/*
 * Operators 
 * Unary Operators - postfix expr++
 *                           expr--
 *                   prefix  ++expr
 *                           --expr
 *                           
 *  int i =0;
 *  System.out.println(i++) ;//0
 *  System.out.println(i); //1
 *  
 *  System.out.println(++i) ;//1
 *  System.out.println(i); //1
 *  
 *                   
 * Logical Operators
  *   Logical AND - &&
  *   Logical OR - ||
  *   Logical NOT - !
 *   
 * Bitwise Operators
 *   AND - &
 *   XOR - ^
 *   OR - |
 *    
 * Arithmatic Operators
 *  *,/, %, +, -
 * 
 * Shift Operators
 *   >> - right shift   
 *   << - left shift
 * Relational Operators
 *  < , > , <=, >=, !=
 *  
 * Assignment Operators
 *  +=, -=, *=, /=, %=
 * 
 * Ternary Operators
 *   :? -
 *   
 * Flow Control
 * -----------
 *  Decision making/Condtional statements
 *   if statements
 *    if(condition) {
 *      //logic
 *    }
 *    
 *    // if-else
 *    if(condition) {
 *      //logic
 *    } else {
 *      //logic
 *    }
 *    
 *    // if- else if -else
 *    if(condition) {
 *      //logic
 *    } else if {
 *      //logic
 *    } else if {
 *      //logic
 *    } else {
 *       // logic
 *    }
 *   
 *  //swich statements - byte, short, int, char and String
 *    
 *    int i = 5;
 *    switch(expr) {
 *      case 1:
 *        // logic
 *        break;
 *      case 2:
 *        // logic
 *        break;
 *      case 3:
 *        // logic
 *        break;
 *      default:
 *        // logic  
 *    
 *    }
 *     
 *  Loop statements
 *   while 
 *     while(condition) {
 *       // logic
 *     }
 *   do while
 *    do {
 *    	// logic
 *    } while(condition)
 *    
 *   for loop
 *    for(int i=0; i<10; i++) {
 *    	//logic
 *    }
 *  
 *   foreach loop
 *    for(int i:array) {
 *      // logic
 *    }
 *   
 *  
 *  Jump statements 
 *   break 
 *   continue 
 */

package day2;

public class OperatorsDemo {

	int i = 0;

	public static void main(String[] args) {

		OperatorsDemo od = new OperatorsDemo();
		
		int x = 0;

		System.out.println(od.i++);// 0
		System.out.println(od.i); // 1

		//System.out.println(od.++i) ;//1
		System.out.println(++x); //1
		System.out.println(--x); // 0

		// add 10 numbers
		int sum =0;
//		for(int i = 0; i<10; i++) {
//			//sum= sum+i;
//			sum+=i;
//		}
//		System.out.println(sum);
		
		// add all numbers from 0-9 except 5
//		for(int i = 0; i<10; i++) {
//			//sum= sum+i;
//			if(i==5) {
//				continue;
//			}
//			sum+=i;
//		}
//		System.out.println(sum);
		
		// add even numbers from 0-9
		for(int i = 0; i<10; i++) {
			//sum= sum+i;
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		//add even numbers from 0-9 using while loop
		int i =0;
		while(i%2==0) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		
	    // find given year is a leap year or not. year should be divisible by 4, 100 and 400 then consider given year as leap.
		
		int year= 1999;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Given year is leap year");
				} else {
					System.out.println("Given year is not a leap year");
				}
			} else {
				System.out.println("Given year is not a leap year");
			}
		} else {
			System.out.println("Given year is not a leap year");
		}
		
		
	}

}
