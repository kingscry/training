package construc;

public class Employee {
	 int ID;
	 String name;
	 String companyname;
	 double salary;
	 public void working() {
	  System.out.println(name +" is working ");
	 }
	    public Employee(int ID, String name, String companyname, double salary) {
	        this(ID,name,companyname);
	        this.salary = salary;
	        System.out.println("4 arg constructor");
	    }
	  public Employee(int ID, String name, String companyname) {
	         this(ID,name);
	         this.companyname = companyname;       
	         System.out.println("3 arg constructor");
	     }
	  public Employee(int ID, String name ) {
	         this(ID);
	         this.name = name;
	         System.out.println("2 arg constructor");
	     }   
	  public Employee(int ID) {
	   this.ID = ID;
	   System.out.println("1 arg constructor");
	  }
	  public Employee() { 
		    System.out.println("No-arg constructor"); 
		    }

}
