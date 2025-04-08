package test;

public class PartTimeEmployee extends Employee{
	private int workingHours;
	
	public PartTimeEmployee(String name,double salary,int workingHours){
		super(name, salary);
		this.workingHours=workingHours;
	}
	//@override
    void employeeInfo() {
    	super.employeeInfo();
    	System.out.println("Working Hours:"+workingHours);
    	System.out.println("Job role:"+jobDesignation());
    	
    }
    String jobDesignation() {
    	return "Cloud Engineer";
    }

}
