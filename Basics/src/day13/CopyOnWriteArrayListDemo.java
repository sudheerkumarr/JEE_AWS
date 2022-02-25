/*
* Collection(I) <- List(I) <- CopyOnWriteArrayList(C)
* Creates a cloned copy of underlying ArrayList for every update operation.
* At certain point of time JVM  will synchronized both automatically
* An update operation will be performed on cloned copy and there is no
*      effect on threads which are performing read operation.
* Creates clone copy for every update operation.
* Iterator of ArrayList can perform remove operation
* CopyOnWriteArrayList Can't perform remove operation while iterating  - UnsupportedOperationException
* 
* Constructors
*  CopyOnWriteArrayList();
*  CopyOnWriteArrayList(Collection c);
*  CopyOnWriteArrayList(Object[] arr);
*
* Methods
*  boolean addIfAbsent(Object o) - added only if list doesn't contain obj
*  int addAllAbsent(Collection c) -
*      collection of elements added to list, if elements are absent
*        returns number of elements are added
*
 */
package day13;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		// Insertion order maintained
		// duplicates not allowed
		// Thread safety
		CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
		cal.addIfAbsent("X");
		cal.addIfAbsent("Y");
		cal.addIfAbsent("X");
		cal.addIfAbsent("A");
		
		System.out.println(cal); //[X, Y, A]
		
		CopyOnWriteArrayList<String> cal2 = new CopyOnWriteArrayList<>();
		cal2.addIfAbsent("A");
		cal2.addIfAbsent("B");
		cal2.addIfAbsent("C");
		cal2.addIfAbsent("X");
		System.out.println(cal2); // [A, B, C]
		
		int noOfEleAdded = cal.addAllAbsent(cal2); 
		System.out.println(noOfEleAdded);//2
		
		System.out.println(cal);//[X, Y, A, B, C]
		
		// read
		Iterator itr = cal.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("X")) {
				itr.remove(); //UnsupportedOperationException
			}
		}
	}

}
