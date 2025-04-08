package DoublyLinkedList;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		DoublyLinkedList list=new DoublyLinkedList() ;
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to add\nEnter 2 to display forward\nEnter 3 to display backward\nEnter 4 to update\nEnter 5 to insert At a specific position\nEnter 6 to delete element from a specific position");
			int choice=read.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the data");
				list.insert(read.nextInt());
				break;
			}
			case 2:
				list.displayforward();
				break;
			case 3:
				list.displaybackward();
				break;
			case 4:{
				System.out.println("enter the position");
				int p1=read.nextInt();
				System.out.println("Entr the data to update");
				int nd=read.nextInt();
				list.update(p1, nd);
				break;
			}
			case 5:{
				System.out.println("enter the position to insert");
				int p1=read.nextInt();
				System.out.println("Entr the data to insert");
				int nd=read.nextInt();
				list.insertAt(p1, nd);
				break;
				
			}
			case 6:{
				System.out.println("Enter the position to delete");
				int p1=read.nextInt();
				list.delete(p1);
				break;}
		}
	}
}
}

