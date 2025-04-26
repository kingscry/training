package lists;
import java.util.ArrayList;

public class arrayListMethods {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		//add all
		ArrayList list=new ArrayList(a1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(null);
		list.addAll(a1);
		list.add("Hello");
		System.out.println(list);
		System.out.println(list.size());
		
		//all element at an index
		a1.add(0,75);
		System.out.println(a1);
		
		
		ArrayList al2=new ArrayList<>();
		al2.add("hello");
		al2.add("world");
		//add all of collection at a specific index
		a1.addAll(1,al2);
		System.out.println(a1);
		//the complete al2 collection will be added to a1 as a single element
		a1.add(al2);
		System.out.println(a1);
		
		//fetch element
		System.out.println(a1.get(2));
		System.out.println(a1.get(1));
		
		
		//clear all elements
		System.out.println(al2.size());
		al2.clear();
		System.out.println(al2.size());
		System.out.println("____________________________________");
		
		//remove element
		ArrayList al3=new ArrayList<>();
		al3.add(10);
		al3.add('c');
		al3.add("hello");
		al3.add(null);
		
		System.out.println(al3.remove(null));
		System.out.println(al3.remove("hello"));
		
	    //throws IndexOutOfBound Exception as 10 and character 'a' are implicitltcalling 
		//remove(index) rather than remove(object)
		Integer x=10;
		System.out.println(al3.remove(x));
		Character ch='c';
		System.out.println(al3.remove(ch));
		System.out.println(al3);
		
		System.out.println("_____________________________________________________");
		//remove all
		ArrayList<Integer> al4=new ArrayList<Integer>();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(10);
		
		ArrayList<Integer> al5=new ArrayList<Integer>();
		al5.add(10);
		al5.add(1);
		al5.add(2);
		
		System.out.println(al5);
		al5.removeAll(al4);
		System.out.println(al5);
		
		System.out.println("_____________________________________________________");
		al5.add(10);
		al5.addAll(al4);
		System.out.println(al5);
		
		al5.retainAll(al4);
		System.out.println(al5);
		
		
		
		}

}
