package construc;

public class Student {
	int ID = 1;
	 String name = "Anuska";
	 String college = "IEM";
	 double marks = 90.89;
	 public void study() {
	  System.out.println(name +" is studying ");
	 }
	    public Student(int ID, String name, String college, double marks) {
	        this.ID = ID;
	        this.name = name;
	        this.college = college;
	        this.marks = marks;
	    }
	  public Student(int ID, String name, String college) {
	         this.ID = ID;
	         this.name = name;
	         this.college = college;       
	     }
	  public Student(int ID, String name ) {
	         this.ID = ID;
	         this.name = name;
	         System.out.println("2 arg constructor");
	     }
	   public Student() { 
	    System.out.println("No-arg constructor"); 
	    }
	  public Student(int ID) {
	   this.ID = ID;
	   System.out.println("1 arg constructor");
	  }
}
