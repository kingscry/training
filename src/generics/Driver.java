package generics;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student=new Student<Person>(new Person(10,"Rohit"));
		printDetails(student);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		
		print(list);
		
		List<Number> ls=new ArrayList<Number>();
		ls.add(10);
		ls.add(10);
		ls.add(10);
		ls.add(10);
		ls.add(10);
		ls.add(10);
		
		printData(ls);
		
	}
	public static void printDetails(Student<? extends Person> student){
		Person p=student.obj;
		System.out.println(p);
	}
	public static void print(List<? extends Number> list) {
		System.out.println(list.get(0));//upper bound wild card .. can only read not write
	}
	public static void printData(List<? super Number> list) {//? superclass type operator or same class type operator
		list.add(65);
		System.out.println(list.get(0));//lower bound wild card .. we can read as well as write
	}
	public void printList(List<?> list) {
		System.out.println(list);//read only operation 
		//list.add(80); it will give error bcz ? is read only operator
	}
}
