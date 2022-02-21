package day9;

// Functional interface
@FunctionalInterface
interface Intf1 {
	boolean isEven(int num);
	
	//supports any number of  default and static methods
}
@FunctionalInterface
interface Intf2 {
	String greet(String name);
	
}

@FunctionalInterface
interface Intf3 {
	int add(int a, int b);
	
	default int sub(int a, int b) {
		return a-b;
	};
	
	static int mul(int a, int b) {
		return a*b;
	}
}

@FunctionalInterface
interface Intf4 {
	void helloWorld();
}

public class LambdaExprDemo {

	public static void main(String[] args) {

		// Lambda expression
		Intf1 even = (int num)->
		{
			if(num%2==0) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(even.isEven(10));
		
		// Lambda expr
		Intf2 gr = (String name) ->  "Hello "+name;
		System.out.println(gr.greet("Kumar"));
		
		// Lambda expr
		Intf3 a = (int x, int y) -> x+y;
		System.out.println(a.add(10, 10));
		
		// Lambda expr
		Intf4 hw = () -> System.out.println("Hello World!");
		hw.helloWorld();
		
		
	}
	// Methods
	// isEven
//	boolean isEven(int num) {
//		if(num%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	String greet(String name) {
//		return "Hello "+name;
//	}
//
//	int add(int x, int y) {
//		return x+y;
//	}
//	
//	void helloWorld() {
//		System.out.println("Hello World!");
//	}
	
	// write lambda expression to square the given number
	// write lambda expression to concatenate strings
	// Iterate collections using forEach loop
	// hint: ArrayList<Integer> al = new ArrayList<>();
	// al.forEach(//lambda expr to print arraylist elements);
	
//	ArrayList<Integer> al = new ArrayList<>();
//	al.add(10);
//	al.add(40);
//	al.add(50);
//	al.add(70);
//	al.add(40);
//	al.add(80);
//	al.add(35);
//	al.add(35);
//	al.add(80);
//return values greater than 50
//return even numbers
//get odd numbers count
//Sort in ascending order
//find min & max values
	
	
	
}
