package day4;

public class InterfaceDemo  {

	public static void main(String[] args) {
		// Case 1: ref & obj type is ClassA
		//ClassA a = new ClassA(); // tight coupling
		ClassB a = new ClassB(); // tight coupling
		a.m1();
		//a.m2();
		a.add(0, 0);
		a.sub(0, 0);
		System.out.println(a.x);
		System.out.println(Intf.x);
		
		System.out.println();
		// Case 2: ref - Intf type & obj - ClassA
		Intf a1 = new ClassB(); // loose coupling
		a1.add(0, 0);
		a1.sub(0, 0);
		a1.m1();
		System.out.println(a1.x);
		System.out.println(Intf.x);
		
		// Accessing static & default methods from interface
		Intf.m6();
		a1.m5();
		
		
		//IE, Chrome, Mozilla
		// DriverManager - Intf - set of method
		// DriverManager dm = new InternetExplorer();
		// DriverManager dm = new ChromeBrowser();
		// dm.open(url);
		
		Product product = new Product();
		product.setProductId(2001);
		product.setProductName("LG TV");
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		
	}
	

}
