// Callable(I) - 1.5v
// provides call() method
// call() method return type - Object
// No need to handle exception
// introduced in 1.5v
// pkg - java.util.concurrent


package day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable {
	
	int num;

	
	// Constructors
	MyThread() {
	
	}
	MyThread(int n) {
		this.num = n;
	}
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+ "Started");
		Thread.sleep(2000);
		return num*num;
	}
	
	
	
}
public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		// array of MyThread jobs
		MyThread[] myThreads = {
				new MyThread(10),
				new MyThread(20),
				new MyThread(30),
				new MyThread(40),
				new MyThread(50),
				new MyThread(60),
				new MyThread(70),
				new MyThread(80),
		};
		
		// Create a thread pool of required size
		ExecutorService service = Executors.newFixedThreadPool(5);
	
		// map jobs to pool
		for( MyThread m:myThreads) {
			Future futureObj = service.submit(m);
			System.out.println(futureObj.get());
		}
	

		
		// Shutdown service
		service.shutdown();
		
		/*
		 * int[] intArr = {10, 20, 30, 40, 50 ,60}
		 * ExecutorService service = Executors.newFixedThreadPool(5);
		 * for(int x: intArr) {
		 *   Future futureObj = service.submit(()->{Thread.sleep(1000); return x*x;});
		 *   System.out.println(futureObj);
		 * }
		 * service. shutdown();
		 * 
		 */
		
		

	}

}
