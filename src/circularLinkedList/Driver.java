package circularLinkedList;

public class Driver {
	public static void main(String[] args) {
		CircularSinglyLinkedList list=new CircularSinglyLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.delete(1);
		list.display();
	}

}
