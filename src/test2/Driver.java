package test2;

public class Driver {
	public static void main(String[] args) {
		University un=new University();
		Student st=new Student("Rohit",19,12345);
		Student st2=new Student("Rohan",18,1235);
		Student st3=new Student("Rit",19,1245);
		Professor pr=new Professor("raj",25,"Maths");
		Professor pr2=new Professor("ajay",27,"Eco");
		un.addPerson(st);
		un.addPerson(st2);
		un.addPerson(st3);
		un.addPerson(pr);
		un.addPerson(pr2);
		un.showPeople();
		st.displayInfo();
		st2.displayInfo();
		pr2.displayInfo();
		
		
		
		
	}

}
