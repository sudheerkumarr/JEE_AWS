/*
 * Iterable(I)
 *  Collection(I) 
 *   Set(I)
 *     HashSet(C)
 *     LinkedHashSet(C)
 *   SortedSet(I)
 *     NavigableSet(I)
 *       TreeSet(C)
 *
 *  duplicate values - won't allowed
 *  Insertion Order - won't maintain
 *  Heterogeneous - Supports
 *  Iterate
 *    foreach, iterator  
 *    
 *  LinkedHashSet:
 *    No Duplicates
 *    Maintains order of insertion
 *    Heterogeneous elements - supports
 *  
 */
package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set s = new HashSet();
		// add, remove, addAll, removeAll, retainAll, contains, isEmpty()
		s.add("aa");
		s.add(10);
		s.add(true);
		s.add(10);

		System.out.println(s);// "aa", 10, true

		Set<String> s1 = new HashSet<>();
		s1.add("aa");
		s1.add("bb");
		s1.add("aa");

		System.out.println(s1);// "aa", "bb", "aa"

		System.out.println();
		Set<Employee> employees = new HashSet<>();
		Employee emp1 = new Employee(1001, "Ram");
		Employee emp2 = new Employee(1002, "Sam");
		Employee emp3 = new Employee(1001, "Ram");
		Employee emp4 = new Employee(1003, "Jhon");
		Employee emp5 = emp1;

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		// Without overriding hashCode() and equals() method
		// Hash code generated based on object address
//		System.out.println("emp1: " + emp1.hashCode()); //1365202186
//		System.out.println("emp2: " + emp2.hashCode()); //1651191114
//		System.out.println("emp3: " + emp3.hashCode()); //1586600255
//		System.out.println("emp4: " + emp4.hashCode()); //474675244
//		System.out.println("emp5: " + emp5.hashCode()); //1365202186
//		System.out.println(employees); // 4 objects - emp1, emp2, emp3, emp4

		// After Overriding hashCode() and equals() method
		// hashcode generated based on empId & name
		System.out.println("emp1: " + emp1.hashCode()); // 113910
		System.out.println("emp2: " + emp2.hashCode()); // 114902
		System.out.println("emp3: " + emp3.hashCode()); // 113910
		System.out.println("emp4: " + emp4.hashCode()); // 2340083
		System.out.println("emp5: " + emp5.hashCode()); // 113910

		System.out.println(employees); // 3 objects - emp1, emp2, emp4

		System.out.println();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		// LinkedHashSet(C)
		LinkedHashSet<Employee> lsh = new LinkedHashSet<>();
		// duplicates not allowed, insertion order maintained
		lsh.add(emp4);
		lsh.add(emp5);
		lsh.add(emp1);
		lsh.add(emp2);
		lsh.add(emp3);

		System.out.println(lsh); // 3 objects - emp1, emp2 and emp4

		System.out.println();
		Iterator<Employee> itr1 = lsh.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// TreeSet - Sort
		// no duplicates, Won't maintain insertion order, stores elements based on
		// natural sorting algorithm.
		Set<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(40);
		ts.add(10);
		ts.add(80);
		ts.add(10);

		System.out.println(ts); // 10, 20, 40, 80

//		Employee emp1 = new Employee(1001, "Ram"); 
//		Employee emp2 = new Employee(1002, "Sam");
//		Employee emp3 = new Employee(1001, "Ram");
//		Employee emp4 = new Employee(1003, "Jhon");
//		Employee emp5= emp1;

		// hashcode generated based on empId & name
//				System.out.println("emp1: " + emp1.hashCode()); //113910
//				System.out.println("emp2: " + emp2.hashCode()); //114902
//				System.out.println("emp3: " + emp3.hashCode()); //113910
//				System.out.println("emp4: " + emp4.hashCode()); //2340083
//				System.out.println("emp5: " + emp5.hashCode()); //113910		

		Set<Employee> emps = new TreeSet<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		System.out.println();
		System.out.println(emps);// ClassCastException
									// emp1, emp2, emp4

		// Comparator
//      // Option 1:
//		Set<Student> students = new TreeSet<>(new Comparator() {
//          // comparision based on name
//			@Override
//			public int compare(Object o1, Object o2) {
//				Student std1 = (Student) o1;
//				Student std2 = (Student) o2;
//
//				return std1.name.compareTo(std2.name);
//			}
//
//          // comparision based on rollNo
//			@Override
//			public int compare(Object o1, Object o2) {
//				Student s1= (Student)o1;
//				Student s2= (Student)o2;
//				if(s1.rollNo>s2.rollNo) {
//					return 1;
//				} else if(s1.rollNo<s2.rollNo) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//
//		});

		// Option 2 : passing Comparator implementation class object.
		Test test = new Test();
		Set<Student> students = new TreeSet<>(test);
		Student std1 = new Student(2002, "Kavitha");
		Student std2 = new Student(2003, "Kavitha");
		Student std3 = new Student(2003, "Ram");
		Student std4 = new Student(2004, "Krish");

		// Adding students to treeset
		//students.add(new Student(2001, "Ravi"));
		students.add(std1);
		students.add(std4);
		students.add(std3);
		students.add(std2);
				
		
		System.out.println(students);
//		
//		for(Student std:students) {
//			
//		}
//		
//		al.addAll(students);
		

		//System.out.println(students);// ClassCastException
//
//		Comparator<Student> cmp = new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				Student std1 = (Student) o1;
//				Student std2 = (Student) o2;
//
//				return std1.name.compareTo(std2.name);
//			}
//
//		};
		
//
//		// Options to convert set to arraylist
//		List<Student> al = new ArrayList(students);
//		
//		
//		Collections.sort(al, cmp);
//		System.out.println(al); // 
//
	}
}

class Test implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student std1 = (Student) o1;
		Student std2 = (Student) o2;

		return std1.name.compareTo(std2.name);
	}

}