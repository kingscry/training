package test2;

public class Professor extends Person{
	String spec;
	public Professor(String name,int age, String spec) {
		super(name,age);
		this.spec=spec;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Specialization:"+spec);
		
	}
}
