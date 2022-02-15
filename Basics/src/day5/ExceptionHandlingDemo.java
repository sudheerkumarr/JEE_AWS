/*
 * Exception handling
 *   unwanted event that occurs during execution of program.
 *   Disturbs normal flow of execution.
 *    
 *   Object(C) <---Throwable(C) <---Exception
 *                              <---Error 
 *   Throwable - Parent Class for Exception & Error
 *   Exceptions
 *     CheckedException
 *       Exceptions that are checked during compilation time
 *        IOException
 *        ClassNotFoundException
 *        SQLException
 *     UncheckedException
 *       Exceptions that occur during run time
 *       RunTimeException
 *         Arithmetic Exception
 *         NullPointerException
 *         ArrayIndexOutOfBoundsException
 *         StringIndexOutOfBoundsException
 *          
 *    
 *    Errors
 */
package day5;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	static String str;
	static Employee emp = new Employee();
	public static void main(String[] args) {
		ExceptionHandlingDemo ed = new ExceptionHandlingDemo();
		
		// try-catch
		/*
		try {
			//risk code
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1st number"); // 10
			//String num1 = sc.next();
			int num1 = sc.nextInt();
			// convert String to primitive
			//int n1 = Integer.parseInt(num1);
			System.out.println("Enter 2nd number"); //20
			//String num2 = sc.next();
			//int n2 = Integer.parseInt(num2);
			
			int num2 = sc.nextInt();
		
			System.out.println(num1/num2);// 1020 // ArithmeticException
			System.out.println("Hello".charAt(4)); //StringIndexOutOfBoundsException
			int[] numArr = {10, 20, 30};
			System.out.println(numArr[2]);//ArrayIndexOutOfBoundsException
			System.out.println(Integer.parseInt("10"));//10
			Integer.parseInt("10");//NumberFormatException
			//System.out.println(str.length());//NullPointerException
			System.out.println(emp.empId);
		} catch(ArithmeticException e) {
			e.printStackTrace(); // prints error stack
		} catch(StringIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage()); // prints error message
			//e.printStackTrace();
			System.out.println("index value should be within length of String ");
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}
		// code
		System.out.println("Outside of try-catch block");
		*/
		
		// try with mutiple catch block
		try {
			System.out.println(10/2);
			System.out.println("Hello".charAt(4));
			System.out.println(Integer.parseInt("10"));
			
		} catch (ArithmeticException | StringIndexOutOfBoundsException | NumberFormatException  e ) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}
		ed.m1();
		//System.out.println(ed.div(10,0));
		
		System.out.println("Outside of try-catch block");	
		
		

	}
	
	int div(int x, int y) throws InvalidNumberException {
		if(y==0) {
			throw new InvalidNumberException("Second number should be greater than 0");
		}
		return x/y;
	}
	
	void m1(){
	 try {
	   m2();
	 } catch(InvalidNumberException e) {
		 //e.printStackTrace();
		 System.out.println(e.getMessage());
	 }
	}
    void m2() {
    	
    		div(10,0);
    	
    	
    }
}
