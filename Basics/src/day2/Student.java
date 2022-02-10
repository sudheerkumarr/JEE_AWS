package day2;

public class Student {
	
	// Fields
	public int rollNo;
	public String name;
	
	
	// Constructors
	public Student() {
		
	}
	
	public Student(int rollNo, String name) {
		this.name=name;
		this.rollNo=rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}

	
	
}
