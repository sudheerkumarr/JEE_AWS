package day4;

public class Student extends Person{
	
	int rollNo;
	String sec;
	
	int getRollNo() {
		return this.rollNo;
	}
	
	String getSec() {
		return this.sec;
	}
	
	void m1() {
		System.out.println("Student class m1() method");
	}

}
