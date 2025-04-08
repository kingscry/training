package test;

public class Driveremp {
	public static void main(String[] args) {
		Employee emp1=new FullTimeEmployee("Rahul",455500,200);//upcasting
		Employee emp2=new PartTimeEmployee("Raj",350000,4);
		emp1.employeeInfo();//polymorphism with help of constructor
		System.out.println("---------------------------------------------------");
		emp2.employeeInfo();				
	}
	static void dtails(Employee e) {
		if(e instanceof FullTimeEmployee) {
			e.jobRole();
		}
		else {
			((PartTimeEmployee)e).jobDesignation();
		}
	}

}
