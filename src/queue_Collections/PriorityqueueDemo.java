package queue_Collections;

import java.util.PriorityQueue;

public class PriorityqueueDemo {
	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		//below code gives claasscastException
//		queue.add("hello");
//		queue.add(10);
//		queue.add(21.3);
		queue.add(10);
		queue.add(01);
		queue.add(91);
		queue.add(44);
		queue.add(23);
		queue.add(14);
		
		System.out.println(queue);
	}

}
