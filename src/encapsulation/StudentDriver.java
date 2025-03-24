package encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		StudentManagement s = new StudentManagement();
		s.getname(1234);
		s.setbranch("Monalisa", 1234);	
		s.changeage(22, 1234);
	}
}
