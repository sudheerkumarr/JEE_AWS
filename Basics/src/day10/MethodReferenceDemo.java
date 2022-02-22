/*
 * static method reference
 * instance method reference
 * constructor reference
 */
package day10;

class MyThread implements Runnable {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static int m1(int num1, int num2) {
		return num1+num2;
	}
	
	int square(int num) {
		return num*num;
	}
}

@FunctionalInterface
interface Intf1 {
	int add(int x, int y);
}

@FunctionalInterface
interface Intf2 {
	int sq(int x);
}

@FunctionalInterface
interface Intf3 {
	//Employee getEmployee();
	Employee getEmployee(int id, String name);
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// Option 1
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
		
		System.out.println();
		// Option 2
		Runnable r = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t3= new Thread(r);
		t3.start();
		
		System.out.println(Thread.activeCount());
		
		System.out.println();
	// Option 3: using method reference
		//ClassNameContained::StaticMethodName; // static method reference
		//ObjectName::instanceMethodName ;// instance method reference
		//ClassName::new ;// constructor reference
		MyThread mt1 = new MyThread();
		Runnable r1 = mt1::run; // instance method reference
		Thread t4 = new Thread(r1);
		t4.start();
		
		
		
		//ex:  static method reference
		// ClassName::methodName
		Intf1 i1= MyThread::m1;
		System.out.println(i1.add(10, 20)); //30
		
		// ex2: instance method reference
		// ObjectName::methodName
		Intf2 s = mt1::square;
		System.out.println(s.sq(5)); //25
		
		// constructor reference - method returns an object
		// ClassName::new
		Intf3 i2 = Employee::new;
//		Employee emp1 = i2.getEmployee();
//		Employee emp2 = i2.getEmployee();
//		Employee emp3 = i2.getEmployee();
//		
//		System.out.println(emp1.empId);
//		System.out.println(emp2.empId);
//		System.out.println(emp3.empId);
//		
		Employee emp1 = i2.getEmployee(1001, "Sai");
		Employee emp2 = i2.getEmployee(1002, "Ram");
		Employee emp3 = i2.getEmployee(1003, "Jai");
		
		System.out.println(emp1.empName);
		System.out.println(emp2.empName);
		System.out.println(emp3.empName);
		
	}

}
