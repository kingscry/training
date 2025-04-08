package singlyLinkedList;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 to insert data\nEnter 2 to display\nEnter 3 to update\nEnter 4 to insert at specific position\nEnter 5 to Delete element\nEnter 6 to exit");
			int choice=read.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the data");
				int data=read.nextInt();
				list.insert(data);
				break;
			}
			case 6:
				flag=false;
				break;
		
			case 2:
				list.display();
				break;
			case 3:{
				System.out.println("Enter the position to update");
				int p1=read.nextInt();
				System.out.println("Enter the new data you want to update");
				int nd=read.nextInt();
				list.update(p1, nd);
				break;
			}
				
			case 4:{
				System.out.println("Enter the position to update");
				int p1=read.nextInt();
				System.out.println("Enter the new data you want to insert");
				int nd=read.nextInt();
				list.insertAt(nd, p1);
				break;
			}	
			case 5:{
				System.out.println("Enter the position to delete");
				int p1=read.nextInt();
				list.delete(p1);
				break;
			}
			default:
				System.out.println("invalid choice");
				
			}	
	}

}
}