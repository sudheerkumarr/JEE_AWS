package day6;

public class Student {
	
	// Fields
	int rollNo;
	String name;
	
	// Constructors
	Student() {}
	Student(int rollNo, String name) {
		this.rollNo= rollNo;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}
