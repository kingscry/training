package construc;

public class EmployeeDriver {
	public static void main(String[] args) {
		  Employee s1 = new Employee(1,"raj","IEM",670000.83);
//		  s1.name = "raj";
//		  s1.companyname = "IEM";
//		  s1.ID = 1;
//		  s1.salary = 670000.54;
		  System.out.println(s1.companyname + " " + s1.ID + " " + s1.salary + " " + s1.name);
		  s1.working();
		  System.out.println("-----------------------------------------------------------");
//		  Employee s2 = new Employee();
//		  s2.name = "ravi";
//		  s2.companyname = "IEM";
//		  s2.ID = 2;
//		  s2.salary = 790000.54;
		  //System.out.println(s1.companyname + " " + s2.ID + " " + s2.salary + " " + s2.name);
		 // s2.working();
		 }

}
