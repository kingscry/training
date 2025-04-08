package test;

public class FullTimeEmployee extends Employee{
    private int bonus;
	
	public FullTimeEmployee(String name,double salary,int bonus){
		super(name, salary);//calls employee constructor
		this.bonus=bonus;
	}
	//@override
    void employeeInfo() {
    	super.employeeInfo();
    	System.out.println("Bonus :"+bonus);
    	System.out.println("Job role:"+jobDesignation());
    }
    String jobDesignation() {
    	return "Software Engineer";
    }

}
