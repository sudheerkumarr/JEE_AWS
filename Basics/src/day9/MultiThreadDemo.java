/*
 * Multi Threading
 * Multitasking - Executing more than one task 
 *  Multi processing - OS
 *   each process will have its own memory
 *   Communication between process is expensive
 *   Ex: notepad, word , mp3 player, browser
 *   
 *  Multi threading
 *   Java Supports multi threading only
 *   uses shared memory
 *   Threads are part of Process
 *   Communication between thread is cheap
 *   Gaming applications
 *   
 *  Ways To create multithreading
 *   1. Implementing Runnable Interface (Re
 *   2. Extending Thread class
 *   
 *  Which method requires override
 *   run()
 *  start() - start thread
 *  priority - MAX,MIN,NORMAL
 *           - 0-10 - range
 *           - 5 - default
 *  Number of thread created by default - main thread
 *  Name of main thread - main
 *  
 *  Lifecycles of a Thread
 *  New
 *  Runnable
 *  Running
 *  Blocked/Waiting
 *  Terminated
 *  
 */
package day9;

interface IntfA{
	void m1();
}
interface IntfB{
	void m1();
}
interface IntfC{
	void m1();
}

class Test implements IntfA, IntfB, IntfC{

	@Override
	public void m1() {
		// logic
		
	}
	
}

class ClassA{
	void m1() {
		System.out.println("ClassA m1()");
	}
}
class ClassB{
	void m1() {
		System.out.println("ClassB m1()");
	}
}

// Implementing Runnable Interface
// Step 1
class MyThread extends  ClassA implements Runnable{

	@Override

	public void run() {
		for(int i=0; i<10;i++) {
			
			//System.out.println(Thread.currentThread().getState());
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

//100 - yield()
// 200 - yield()
public class MultiThreadDemo {

	public static void main(String[] args) {
		// Step 2: create object for Thread class
		MyThread mt = new MyThread();
		
		//Step3:  Create Thread
		Thread t = new Thread(mt);  // thread state - New
		System.out.println(t.getState()); // New
		
		// Before calling start() method
		System.out.println(Thread.activeCount());//1
		//Step 4: Start thread
		t.setName("MyThread"); // Change thread name
		
		t.start(); // Thread state - "Runnable"
		System.out.println(t.getState());
		// priority
		System.out.println("t thread priority "+t.getPriority());//5
		System.out.println("main thread priority "+Thread.currentThread().getPriority());//5
		
		t.setPriority(1);
		Thread.currentThread().setPriority(10);
		
		System.out.println("t thread priority "+t.getPriority());//0
		System.out.println("main thread priority "+Thread.currentThread().getPriority());//10
		
		
		// active count
		System.out.println(Thread.activeCount());// 2
		
		// isAlive()
		System.out.println(t.isAlive());// true
		System.out.println(Thread.currentThread().isAlive()); // true
		
		
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		// Number of thread - 2 thread - main thread & MyThread
		for(int i=0; i<10; i++) {
			if(i==5) {
				//t.yield();
			}
			//System.out.println(Thread.currentThread().getState());
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
