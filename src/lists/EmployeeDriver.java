package lists;
import java.util.*;
public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList() ;
		employees.add(new Employee(1,"Rohit"));
		employees.add(new Employee(2,"Naveen"));
		employees.add(new Employee(3,"Rahul"));
		
		
		for(Employee e:employees) {
			System.out.println(e);
		}
		
//		Iterator<Employee> emp=employees.iterator();
//		while(emp.hasNext()) {
//			Employee x=emp.next();
//			if(x.name.equals("Naveen")) {
//				emp.remove();
//			}
//		}
//		System.out.println(employees);
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(90);
		
		/*
		 * for(int i:al) { System.out.println(i); }
		 */
//		for(int i:al) {//data got unboxed and i converted from object to int
//			if(i==30) {
//				Integer x=i;
//				al.remove(x);
//				break;
//			}
//		}
		
		//Iterator interface usage
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			if(x==30) {
				itr.remove();
			}
		}
		System.out.println(al);
		
		System.out.println("__________________________________________________________________");
		//ListIterator
		ListIterator list=al.listIterator();
		
//		while(list.hasNext()) {
//			System.out.println("Index: "+list.nextIndex()+"         "+"Element: "+list.next());
//		}
		
		
		while(list.hasPrevious()) {
			list.previous();
		}
		System.out.println("___________________________________________________________________");
		while(list.hasNext()) {
			int index=list.nextIndex();
			if(index==1) {
				list.add(60);
			}
			int element=(Integer)list.next();
			
			if(element==50) {
				list.set(100);
			}	
		}
		System.out.println(al);
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(50);
		ls.add(20);
		ls.add(60);
		ls.add(40);
//		ls.add('a');
//		ls.add("rohan");
//		ls.add(null);
		Collections.sort(ls);
		System.out.println(ls);
		
		System.out.println("___________________________________________________________________");
//sorting based on id using comparable
		Collections.sort(employees);
		System.out.println(employees);
	// sorting based on name using comparator
		CompareByName comparatorObject=new CompareByName();
		Collections.sort(employees, comparatorObject);
		System.out.println(employees);
	}

}
