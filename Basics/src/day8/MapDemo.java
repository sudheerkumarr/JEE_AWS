/*
 * Map(I) :
 *  HashTable()
 *  HashMap(C)
 *  LinkedHashMap(C)
 *  SortedMap(I)
 *    TreeMap(C)
 *    
 * Store data which is in the form of key,value pair
 * 
 * HashMap() - 
 *  Map map = new HashMap();
 *  hm.<HashMap Methods>
 *  
 *  HashMap hm = new HashMap();
 *  map.<Map And HashMap methods>
 *  
 *  
 *  Map<String, Integer> map = new HashMap<>();
 *  HashMap<String, Integer> map = new HashMap<>();
 *  
 *  Collection
 *    List, Set, Queue
 *   
 *  List(I)
 *    ArrayList, LinkedList, Vector, Stack
 *    
 *  List list = new Vector();
 *  // logic
 *  Stack list = new Stack();
 *   
 *  duplicate keys - won't allowed
 *  duplicate values - allowed
 *  order of insertion - won't maintain
 *  null keys - allowed
 *  Only one null key allowed
 *  null values - allowed
 *  any number of null values allowed
 *  
 */

package day8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<>();
		marks.put("Ram", 78);
		marks.put("Sam", 90);
		marks.put("Ram", 80);
		marks.put("Ravi", 90);
		marks.put(null, null);
		marks.put(null, null);
		marks.put("Kavitha", null);

		System.out.println(marks);// {null=null, Ravi=90, Kavitha=null, Sam=90, Ram=80}

		Map<Employee, Employee> employees = new HashMap<>();
		Employee emp1 = new Employee(1001, "Ram");
		Employee emp2 = new Employee(1002, "Jhon");
		Employee emp3 = new Employee(1003, "Sam");
		Employee emp5 = new Employee(1003, "Sam");
		Employee emp4 = emp1;

		// Hashcode based on address
		System.out.println(emp1.hashCode()); // 1365202186
		System.out.println(emp2.hashCode()); // 1651191114
		System.out.println(emp3.hashCode()); // 1586600255
		System.out.println(emp4.hashCode()); // 1365202186
		System.out.println(emp5.hashCode()); // 474675244

		// Hashcode based empId & empName
		System.out.println(emp1.hashCode()); // 113910
		System.out.println(emp2.hashCode()); // 2340052
		System.out.println(emp3.hashCode()); // 114933
		System.out.println(emp4.hashCode()); // 113910
		System.out.println(emp5.hashCode()); // 114933

		employees.put(emp1, emp1);
		employees.put(emp2, emp2);
		employees.put(emp3, emp3);
		employees.put(emp4, emp4);
		employees.put(emp5, emp5);

		System.out.println(employees); // emp1, emp2, emp3, emp5 - without overriding hashcode() and equals() methods
		// System.out.println(employees); //emp1, emp2, emp5 - after overriding
		// hashcode() and equals() method

		//
		Map<String, String> hs = new HashMap<>();
		hs.put(new String("a"), "Ram");
		hs.put(new String("a"), "Sam");

		System.out.println(new String("abc").hashCode());// 97
		System.out.println(new String("abc").hashCode());// 97
		System.out.println(hs); // Sam

		// LinkedHashMap
		/*
		 * duplicate keys - won't allowed duplicate values - allowed order of insertion
		 * - maintained null keys - allowed, Only one null key allowed null values -
		 * allowed, any number of null values allowed
		 */

		Map<String, Integer> marks1 = new LinkedHashMap<>();
		marks1.put("Ram", 78);
		marks1.put("Sam", 90);
		marks1.put("Ram", 80);
		marks1.put("Ravi", 90);
		marks1.put(null, null);
		marks1.put(null, null);
		marks1.put(null, 100);
		marks1.put("Kavitha", null);

		System.out.println(marks1); // {"Ram"=80, "Sam"=90, "Ravi"=90, null=100, "Kavitha"=null }

		// TreeMap
		/*
		 * null keys - won't support null keys null values - allowed insertion order -
		 * asc duplicate keys - not allowed
		 */
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(2001, "Harsha");
		tm.put(2005, "Ramesh");
		tm.put(2003, "Kavitha");
		tm.put(2004, "Sachin");
		tm.put(2002, "Rahul");
		tm.put(2002, "Rajiv");
		// tm.put(null, null);
		tm.put(2010, null);

		System.out.println(tm); // {2001, 2002, 2003, 2005, 2004, 2010=null, null=null, }

		Map<Employee, Employee> tm1 = new TreeMap<>(new Test());

		tm1.put(emp1, emp1);
		tm1.put(emp2, emp2);
		tm1.put(emp3, emp3);
		tm1.put(emp4, emp4);
		tm1.put(emp5, emp5);

		// Hashcode based empId & empName
//		System.out.println(emp1.hashCode()); // 113910
//		System.out.println(emp2.hashCode()); // 2340052
//		System.out.println(emp3.hashCode()); // 114933
//		System.out.println(emp4.hashCode()); // 113910
//		System.out.println(emp5.hashCode()); // 114933

		System.out.println(tm1);//
		
		// Hashtable Vs HashMap
		/* Hashtable - null keys and null values are not allowed
		             - methods are synchronized - Thread safe
		             - introduced in Java1.0v
		             - duplicate keys not allowed
		             - duplicate values are allowed
		
		*/
		
		// convert Map into SetView
		System.out.println();
		Set<Entry<Employee, Employee>> entries = tm1.entrySet();
		for( Entry<Employee, Employee> en: entries ) {
			System.out.print(en.getKey() +"="+en.getValue());  // returns key value
			System.out.println();
		}
		System.out.println();
		// Option 2
		 Iterator itr = entries.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println(tm1.get(emp1));
		 // keySet()
		

	}

}

class Test implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}
	
}
