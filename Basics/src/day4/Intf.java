package day4;

public interface Intf {
	
	// Fields
	int x = 100;
	
	// abstract methods
	void m1();
	int add(int x, int y);
	int sub(int x, int z);
	
	// Java 1.8 - static & default methods
	default void m5() {
		System.out.println("Intf m5() method");
	}
	static void m6() {
		System.out.println("Intf m6() method");
	}
	
	
}
