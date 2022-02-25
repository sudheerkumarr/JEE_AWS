/*
 * ConcurrentCollections
 * Collection(I)
 * List(I)
 *   ArrayList(C), LinkedList(C)
 *   Vector & Stack(1.0) - legacy classes. provides thread safety
 *    
 * Set(C)
 *  HashSet(C)
 *  LinkedHashSet(C)
 *  TreeSet(C)
 *  
 * Map(I)
 *   HashMap(C)
 *   TreeMap(C) 
 *   LinkedHashMap(C)
 *   SortedMap(I)
 *   
 *   Hashtable(C)1.0 - legacy, provides thread safety
 *   
 *  Collection - methods 
 *  synchronizedList() - 
 *  synchronizedSet()
 *  synchronizedMap()
 *       
 *   Drawbacks 
 *  - performance is slow
 *  - When one thread iterating other thread is trying to modify the value
 *     ConcurrentModificationException occurs in Collection.  
 * 
 *    
 *  Concurrent Collections:
 *  ------------- --------
 *  - More than one thread allowed to iterate
 *  - One thread iterating other thread is trying to modify value 
 *     
 *    
 * Advantages with Concurrent Collection:
 * 
 * 1. Thread safe
 * 2. Performance is high (different locking mechanism)
 * 3. Allows multiple threads to work on object in safe manner
 * 4. ConcurrentCollections won't throw ConcurrentModificationException
 *
 * Concurrent classes: best suitable for scalable multithreaded application
 * 1. ConcurrentHashMap(C)
 * 2. CopyOnWriteArrayList(C) (ArrayList behaviour is on CopyOnWrite)
 * 3. CopyOnWriteArraySet(C)
  
 * java.util.concurrent pkg

 * Map(I)<-ConcurrentMap(I)<-ConcurrentHashMap(C)
   
 * ConcurrentMap(I) methods
 * 1. Object putIfAbsent(Object key, Object value) - add entry to map if specified key is not present
 * 2. boolean remove(Object key, Object value) - removes the entry only if key & value matches
 * 3. boolean replace(Object key, Object oldValue, Object newValue)

 * - Initial capacity of ConcurrentHashMap is 16 buckets (0-15).
 * - thread wont require lock for read
 * - for update/write thread require lock
 * - bucket level locking mechanism used for allowing multiple threads
      instead of locking mechanism on whole object.
 * - 16 threads can work, one on each bucket at the same time
 * - default concurrency level - 16
 * - number of threads = concurrency level
 * 
 * - Constructors in ConcurrentHashMap class
 *   public java.util.concurrent.ConcurrentHashMap(); // fillRation-0.75, cap-16, concurrencyLevel-16
 *   public java.util.concurrent.ConcurrentHashMap(int initialCapacity);
 *   public java.util.concurrent.ConcurrentHashMap(Map m);
 *   public java.util.concurrent.ConcurrentHashMap(int initialCapacity, float fillRatio);
 *   public java.util.concurrent.ConcurrentHashMap(int initialCapacity, float fillRatio, int concurrencyLevel);

 */
package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentCollectionsDemo  extends Thread{
	static Map<Integer, String> hashMap = new HashMap<>();
	static Map<Integer, String> conHashMap = new ConcurrentHashMap<>();
	
	public void run() {
		// write
		try {
			Thread.sleep(1000);
			System.out.println("Child Thread Updating List");
//			hashMap.put(1010, "Rajesh");
//			hashMap.put(1011, "Kavitha");
//			hashMap.put(1011, "Kavitha");
//			hashMap.put(1012, "Rajesh");
//			hashMap.put(1013, "Kavitha");
//			hashMap.put(1014, "Kavitha");
//			hashMap.put(1015, "Rajesh");
//			hashMap.put(1016, "Kavitha");
//			hashMap.put(1017, "Kavitha");
			
			
			conHashMap.put(1010, "Rajesh");
			conHashMap.put(1011, "Kavitha");
			conHashMap.put(1018, "Kavitha");
			conHashMap.put(1012, "Rajesh");
			conHashMap.put(1013, "Kavitha");
			conHashMap.put(1014, "Kavitha");
			conHashMap.put(1015, "Rajesh");
			conHashMap.put(1016, "Kavitha");
			conHashMap.put(1017, "Kavitha");
	} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		hashMap.put(1001, "Ram");
		hashMap.put(1002, "Sam");
		hashMap.put(1003, "Rai");
		
		hashMap.put(1004, "Ram");
		hashMap.put(1005, "Sam");
		hashMap.put(1006, "Rai");
		hashMap.put(1007, "Ram");
		hashMap.put(1008, "Sam");
		hashMap.put(1009, "Rai");
		
		hashMap.put(1001, "Ravi"); // old value will be updated
		
		System.out.println(hashMap); // {1001=Ravi, 1002=Sam, 1003=Rai}
		
		// remove
		hashMap.remove(1001);
		System.out.println(hashMap); //{1002=Sam, 1003=Rai}
		
		// update
		hashMap.replace(1002, "Sam Kumar");
		System.out.println(hashMap); //{1002=Sam Kumar, 1003=Rai}
		
		// ConcurrentHashMap
		
		conHashMap.putIfAbsent(1001, "Ram");
		conHashMap.putIfAbsent(1002, "Sam");
		conHashMap.putIfAbsent(1003, "Rai");
		conHashMap.putIfAbsent(1002, "Ram");
		conHashMap.putIfAbsent(1021, "Ram");
		conHashMap.putIfAbsent(1022, "Sam");
		conHashMap.putIfAbsent(1023, "Rai");
		conHashMap.putIfAbsent(1024, "Ram");
		conHashMap.putIfAbsent(1025, "Sam");
		conHashMap.putIfAbsent(1026, "Rai");
		
		System.out.println(conHashMap); //{1001=Ram, 1002=Sam, 1003=Rai}
		
		//remove - key and value should match to remove entry
		conHashMap.remove(1003, "Ram");
		System.out.println(conHashMap);//{1001=Ram, 1002=Sam, 1003=Rai}
		
		conHashMap.remove(1003, "Rai");
		System.out.println(conHashMap);//{1001=Ram, 1002=Sam}
		
		// replace - key and old value should match to replace
		conHashMap.replace(1001, "Rai", "Ram Kumar");
		System.out.println(conHashMap);// {1001=Ram, 1002=Sam}
		
		conHashMap.replace(1001, "Ram", "Ram Kumar");
		System.out.println(conHashMap);// {1001=Ram Kumar, 1002=Sam}
		
		
		// Thread example
		ConcurrentCollectionsDemo demo = new ConcurrentCollectionsDemo(); // create thread
		demo.start();
		
		// read
		System.out.println();
		Set<Entry<Integer, String>> set = conHashMap.entrySet();
		Iterator<Entry<Integer, String>> itr= set.iterator();
		while(itr.hasNext()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.out.println(itr.next());
		}
		
		System.out.println(conHashMap);
		
		
		
		
		
	}

}
