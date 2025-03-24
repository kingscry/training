package encapsulation;

public class StudentManagement {
	private String email= "mona@gmail.com";
	 private int pass = 1234;
	 private String name = "Mona";
	 private int age = 21;
	 private String gender = "Female";
	 private String branch = "CSE";
	 public void getname(int pass) {
		 if(this.pass == pass) {
			 System.out.println(name);
		 }
		 else {
			 System.out.println("invalid pass");
		 }
	 }
	 public void setbranch(String change, int pass) {
		 if(this.pass == pass) {
			 branch += change;
			 System.out.println(change);
		 }
		 else {
			 System.out.println("invalid pin");
		 }
	 }
	 public void changeage(int newage, int pass) {
		 if(this.pass == pass) {
			 age += newage;
			 System.out.println(newage);
		 }
		 else {
			 System.out.println("can't change");
		 }
	 }
}
