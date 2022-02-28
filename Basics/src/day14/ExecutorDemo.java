package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Employee implements Runnable {
	
	// Fields
	int empId;
	String empName;
	
	// Constructors
	Employee() {}
	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Ended");
		
	}
	
}

public class ExecutorDemo {

	public static void main(String[] args) {
//		Employee mt = new Employee();
//		Thread t1 = new Thread(mt);
//		t1.start();
//		
//		Thread t2 = new Thread(mt);
//		t1.start();
//		
//		
//		Thread t3 = new Thread(mt);
//		t1.start();
//		
//		
		// Thread pool (Executor Framework)
		
		//Create Thread pool
		// java.util.concurrent(1.5v)
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Employee[] employees = {
			new Employee(1001, "Ram"),
			new Employee(1002, "Sam"),
			new Employee(1001, "Raj"),
			new Employee(1002, "Shiva"),
			new Employee(1001, "Palak"),
			new Employee(1002, "Rahul"),
			
		};
		
		// submit jobs to thread pool
		for(Employee emp:employees ) {
			service.submit(emp);
		}
		
		// shutdown the service
		service.shutdown();
	}
}


//Runnable(I) - 1.0v
//provides run() method
//run() method return type - void
//need to handle exception
//introduced in 1.0v
//pkg - java.lang



// Callable(I) - 1.5v
// provides call() method
// call() method return type - Object
// No need to handle exception
// introduced in 1.5v
// pkg - java.util.concurrent


