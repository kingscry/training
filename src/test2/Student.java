package test2;

public class Student extends Person{
	int StudID;
	public Student(String name,int age,int StudID) {
		super(name,age);
		this.StudID=StudID;
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Student ID :"+StudID);
		
	}

}
