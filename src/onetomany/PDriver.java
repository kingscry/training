package onetomany;

import java.util.Scanner;

public class PDriver {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=read.nextInt();
		Post pt=new Post(size,"Canara");
		boolean flag=true;
		while(flag){
			System.out.println("Enter 1 to add customer \nEnter 2 to display List \nEnter 3 to exit");
			int ch=read.nextInt();
			switch(ch) {
			case 1:
				read.nextLine();
				System.out.println("Enter name of user");
				String name=read.nextLine();
				User u=new User(name);
				pt.addUser(u);
				break;
			case 2:
				pt.display();
				break;
			case 3:
				flag=false;
				break;
			}	
		}	
	}


}
