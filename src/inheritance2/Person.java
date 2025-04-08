package inheritance2;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		super();
		this.name=name;
		this.age=age;
	}
   public void displayPersonDetails() {
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
   }

}

