package day10;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

/*
 * java.util.function - pkg
 * Predicate 
 *   
 * Consumer
 * Supplier
 * Function
 * 
 * interface Intf {
 *   boolean isEven(int num);
 * }
 */
@FunctionalInterface
interface Intf {
	boolean isEven(int num);
}

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

		Intf x = (num) -> {
			if (num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(x.isEven(5)); // false
		
		// Predicate - Takes input of any data type and return boolean value
		// public interface java.util.function.Predicate<T> {
	    // 		  public abstract boolean test(T);
		// }
		// ex1:
		Predicate<Integer> x1 = (num) -> {
			if (num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		
		System.out.println(x1.test(10));//true
		
		// ex2:
		
		Predicate<String> sw = (String str) -> str.startsWith("H");
		System.out.println(sw.test("Hello World")); //true
		
		
		// Function - Takes any input data type and return any data type  
		// public interface java.util.function.Function<T, R> {
	    //		  public abstract R apply(T);
		// }
		
		// ex1: - square a given number
		Function<Integer, Integer> square = (num)->num * num;
		System.out.println(square.apply(10));//100
		
		// ex2: find length of the given string
		Function<String, Integer> strLength = (str)->str.length();
		System.out.println(strLength.apply("Hello World!"));//12
		
		// ex 3: cube
		Function<Integer, Integer> cube = (num)->num * num * num;
		System.out.println(cube.apply(10));//1000
		
		// function Chaining
		System.out.println(square.andThen(cube).apply(2)); //64 - square will execute first and then cube
		System.out.println(square.compose(cube).apply(2)); //64 - cube will execute first and then square
		
		// Consumer - 
		//public interface java.util.function.Consumer<T> {
		//	  public abstract void accept(T);
		//}
	
		int[] intArr = {12, 22, 32, 42, 52, 62};
		
		Consumer<int[]> display = (arr)->{
			for(int i=0; i<arr.length; i++) {
				System.out.print(intArr[i]+" ");
			};
		};
		display.accept(intArr);
		
		
		// Supplier - no input but return value
		//public interface java.util.function.Supplier<T> {
		//	  public abstract T get();
		// }
		
		Supplier<Integer> supplier= () -> {
			int indx = (int)(Math.random()*5)+1 ;//0-5
			System.out.println(indx);
			return intArr[indx];
		};
		
		System.out.println();
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	}
//	boolean isStartsWith(String str, String subString) {
//		return str.startsWith(subString);
//	}

}
