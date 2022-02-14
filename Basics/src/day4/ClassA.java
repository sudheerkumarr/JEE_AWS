package day4;

public class ClassA implements Intf{

	@Override
	public void m1() {
		System.out.println("ClassA m1() method");
		
	}
	
	public void m2() {
		System.out.println("ClassA m2() method");
	}

	@Override
	public int add(int x, int y) {
		System.out.println("ClassA add() method");
		return x+y;
	}

	@Override
	public int sub(int x, int z) {
		System.out.println("ClassA sub() method");
		return x-z;
	}

}
