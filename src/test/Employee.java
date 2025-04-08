package test;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
    void employeeInfo() {
    	System.out.println("name :"+this.name+" salary :"+this.salary);
    }
    public void jobRole() {
    	System.out.println("this is");
    }
}
