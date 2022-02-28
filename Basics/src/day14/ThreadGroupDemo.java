package day14;

public class ThreadGroupDemo implements Runnable {

	
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadGroupDemo tgd = new ThreadGroupDemo();
		Thread t1 = new Thread(tgd);
		Thread t2 = new Thread(tgd);
		t1.start();
		t2.start();
		
		System.out.println(t1.getThreadGroup().getName()); // main
		System.out.println(t2.getThreadGroup().getName()); // main
		
		// get main thread name
		System.out.println(Thread.currentThread().getName()); // main
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		
		
		//java.lang.Thread class constructors
//		public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable);
//		  public java.lang.Thread(java.lang.String);
//		  public java.lang.Thread(java.lang.ThreadGroup, java.lang.String);
//		  public java.lang.Thread(java.lang.Runnable, java.lang.String);
//		  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String);
//		  public java.lang.Thread(java.lang.ThreadGroup, java.lang.Runnable, java.lang.String, long);
		
		
		// ThreadGroup(C)
		// Create Thread group
		ThreadGroup tg1 = new ThreadGroup("ThreadGroup1");
		
		// Add threads to the thread group
		
		Thread t3 = new Thread(tg1, tgd);
		Thread t4 = new Thread(tg1, tgd);
		t3.start();
		t4.start();
		
		
			
		//t3, t4 Thread names
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		
		// t3, t4 thread group names
		System.out.println(t3.getThreadGroup().getName());
		System.out.println(t4.getThreadGroup().getName());
				
		// Parent Thread group for ThreadGroup1
		System.out.println(t3.getThreadGroup().getParent()); // main
		System.out.println(t4.getThreadGroup().getParent()); //main
		
		
		ThreadGroup tg2 = new ThreadGroup("ThreadGroup2");
		Thread t5 = new Thread(tg2, tgd);
		t5.start();
		// group name
		System.out.println(t5.getThreadGroup().getName()); // main
		
		// thread name
		System.out.println(t5.getName());
		System.out.println(t5.getThreadGroup().getParent());
		
		ThreadGroup tg3 = new ThreadGroup("ThreadGroup3");

		
		
		// Thread group methods
		// set priority for group1
	    tg1.setMaxPriority(6);
	    System.out.println(tg1.getMaxPriority());
	    
	    System.out.println("main thread group activeGroupCount: "+Thread.currentThread().getThreadGroup().activeGroupCount()); // active sub thread group
	    System.out.println("main thread group activeCount: "+Thread.currentThread().getThreadGroup().activeCount()); // active thread count
	    System.out.println("tg1 active count: "+tg1.activeCount()); //6
	    // get thread group info
	    tg1.list();
	    
	    //Get all threads from a thread group
	    Thread[] threadArr = new Thread[2];
	    tg1.enumerate(threadArr);
	    
	    for(Thread t: threadArr) {
	    	System.out.println(t.getName());
	    }
	    
	    
	    System.out.println(t3.getPriority());
	    System.out.println(t4.getPriority());
		
	}

}
