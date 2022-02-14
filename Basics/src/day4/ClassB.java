package day4;

public class ClassB implements Intf{

	@Override
	public void m1() {
		System.out.println("ClassB m1() method");
		
	}

	public void m3() {
		System.out.println("ClassB m3() method");
	}
	@Override
	public int add(int x, int y) {
		System.out.println("ClassB add() method");
		return x+y;
	}

	@Override
	public int sub(int x, int z) {
		System.out.println("ClassB sub() method");
		return x-z;
	}

}
