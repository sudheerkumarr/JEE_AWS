/*
 * Collection -
 *   represent group of objects as a single entity
 * pkg - java.util
 * Iterable(I)
 *  Collection(I)
 *   List(I)
 *     ArrayList(C) - 
 *       Heterogeneous elements 
 *       Duplicate elements allowed
 *       insertion order maintained 
 *       Iterate
 *         for, foreach, iterator, listIterator
 *       Underlying data structure - arrays
 *       Random Access
 *       No Thread safety
 *       
 *     LinkedList(C)
 *       Heterogeneous elements 
 *       Duplicate elements allowed
 *       insertion order maintained 
 *       Iterate
 *         for, foreach, iterator, listIterator
 *       Underlying data structure - Doubly Linked List
 *       Manipulations
 *       No Thread safety
 *       LinkedList<Integer> ll = new LinkedList<>();
 *     Vector(C)
 *       Heterogeneous elements 
 *       Duplicate elements allowed
 *       insertion order maintained 
 *       Iterate
 *         for, foreach, iterator, listIterator
 *       Underlying data structure - Doubly Linked List
 *       Manipulations
 *       No Thread safety
 *     Stack(C)
 *   Set(I)
 *   Queue(I)
 *   
 *  Map(I)
 *    
 */
package day6;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// ArrayList
		ArrayList al = new ArrayList();
		al.add("ab");
		al.add(10);
		al.add(10.40f);
		al.add('c');
		
		// Generic ArrayList
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("aa");
		al1.add("bb");
		
		al.addAll(al1);
		System.out.println(al);
		
		al.retainAll(al1);
		System.out.println(al);
		
		System.out.println(al.contains("ab"));
		
		// converting ArrayList to Array
		Object[] arr= al1.toArray();
		for(Object obj: arr) {
			System.out.println(obj);
		}
		
		//al.removeAll(al1);
		//System.out.println(al);
		
		// addAll, clear, isEmpty, toArray, contains, remove, sort, subList
		al.clear();
		
		
		// Iterating ArrayList
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		for(Object obj :al) {
			System.out.println(obj);
		}
		
		// Iterator
		System.out.println();
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// ListIterator
		System.out.println();
		ListIterator litr= al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		//al.forEach(x -> {System.out.println(x)});

		List<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		//v.addElement(30);
		
		// Vector
		System.out.println();
		Vector<Integer> v2 = new Vector<>();
		v2.add(10);
		v2.add(20);
		v2.addElement(30);
		v2.removeElement(20);
		System.out.println(v2.elementAt(0)); // 10
		System.out.println(v2.firstElement()); // 10
		Enumeration<Integer> e= v2.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement()); //10, 30
		}
		
		
		// Stack
		System.out.println();
		Stack<Integer> st = new Stack<>();
		st.add(10);
		st.add(20);
		st.addElement(30);
		st.removeElement(10);
		Enumeration<Integer> e1 = st.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement()); //20, 30
		}
		
		st.push(40);
		st.push(50);
		st.pop();
		System.out.println(st.peek()); //40
		System.out.println(st); // 20, 30, 40
		
	}

}
