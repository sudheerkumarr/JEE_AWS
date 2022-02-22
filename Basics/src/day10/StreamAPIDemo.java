/*
 * Collection - To represent group of elements as a single entity  
 * Stream - To process collection of objects
 *  1.8v
 */
package day10;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		Integer[] intArr = {10, 15, 20, 25, 30, 40, 50, 60, 50, 60, 10};
		List<Integer> list = Arrays.asList(intArr);
		
		// create stream object
		Stream s = list.stream();
		long c= s.count();
		System.out.println(c);
		
		// count()
		System.out.println(list.stream().count());
		
		// filter() - filter elements based on some condition
		
		// print values less than 50
		List<Integer> x = list.stream().filter(el->el<50).collect(Collectors.toList());
		System.out.println(x);
		
		// print distinct elements
		List<Integer> dis = list.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		
		// print even values 
		List<Integer> evenValues= list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenValues);
		
		// print odd values 
		List<Integer> oddValues= list.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println(oddValues);
		
		
		// find even number count
		long evenValuesCount= list.stream().filter(num->num%2==0).count();
		System.out.println(evenValuesCount);
		
		// map() - to apply a function on all elements in collection
		List<Integer> square = list.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(square);
		
		// increment all values by 10
		List<Integer> result = list.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(result);
		
		// sorting in asc order
		List<Integer> sortedList= list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// sorting in desc order
		List<Integer> sortedList1= list.stream().sorted((a,b)->a>b?-1:1).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		// Iterate collection - forEach
		list.stream().forEach(num -> System.out.print(num+" "));
		
		System.out.println();
		//find min value in the collection
		Integer min = list.stream().min((i,j)->i>j?1:-1).get();
		System.out.println("Min: "+ min);
		
		// find max
		Optional<Integer> max = list.stream().max((i,j)->i>j?1:-1);
		System.out.println(max);
		System.out.println(max.get());
		System.out.println("Max: "+ max);
	
	}

}
