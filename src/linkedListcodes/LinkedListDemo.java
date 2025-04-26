package linkedListcodes;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.undo.CannotUndoException;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("Java");
		list.add(10);
		list.add(null);
		list.add(42);
		list.add(3.14);
		list.add('a');
		list.add("JAVA");
		
		
		System.out.println(list);
		LinkedList<Person> people=new LinkedList<>();
		people.add(new Person("anuska",21));
		people.add(new Person("john",31));
		people.add(new Person("rohit",11));
		people.add(new Person("rahul",41));
		people.add(new Person("rohan",18));
		System.out.println("Before sorting");
		for(Person p:people) {
			System.out.println(p);
		}
		
		Collections.sort(people);
		System.out.println("After sorting");
		for(Person p:people) {
			System.out.println(p);
		}
		Iterator<Person> itr=people.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("_______________________________________________________________");
		System.out.println(people.peek());
		System.out.println(people.pop());
		System.out.println(people.peekLast());
		System.out.println(people.pollLast());
	}
}
