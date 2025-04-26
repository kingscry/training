package queue_Collections;
import java.util.ArrayDeque;
public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque st=new ArrayDeque();
		//st.addFirst(null);
		st.addLast(10);
		st.addLast(21);
		st.addFirst(65);
		st.addLast("hello");
		
		System.out.println(st);
		System.out.println(st.getFirst());
		System.out.println(st.getLast());
	}
	

}
