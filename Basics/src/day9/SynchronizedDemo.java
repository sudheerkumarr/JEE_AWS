package day9;

import java.time.LocalTime;

class Counter{
	int count; // 0
	
	synchronized void incr(int num) {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(count+=num); 
		}
	}
}

class MyThread2 extends Thread {
	Counter c;
	
	MyThread2(Counter c) {
		this.c = c;
	}
	
	public void run() {
		c.incr(5);
	}
}

class MyThread3 extends Thread {
    Counter c;
	
	MyThread3(Counter c) {
		this.c = c;
	}
	
	public void run() {
		c.incr(10);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		MyThread2 mt2 = new MyThread2(c);
		MyThread3 mt3 = new MyThread3(c);
		
		mt2.start();
		mt3.start();
	    LocalTime time = LocalTime.now();  
	    System.out.println(time);  
	    
	    /*
	     * Lab 7: Layered Architecture
	     * Choose any one option from below
	     * 
	     * 1. Add Employee
	     *    // Get below details
	     *    Enter Id
	     *    Enter Name
	     *    Enter Salary
	     *    Enter Designation
	     *      Display eligible scheme and get confirmation to map scheme with employee(Yes/No)
	     *    Display employee details
	     *      
	     * 2. View Employee
	     *    // Get emp id
	     *    Enter Employee Id
	     *      display employee details
	     *      or display error message
	     * 3. Delete Employee
	     *    // Get emp id
	     *    Enter Employee id
	     *      display success/failure msg 
	     * 4. Update Employee
	     *    // Get below details
	     *    Enter Id
	     *      display existing details
	     *    Enter Name
	     *    Enter Salary
	     *    Enter Designation
	     *    Display employee details
	     */

	}

}
