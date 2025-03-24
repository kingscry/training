package onetomany;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=read.nextInt();
		Bank bank=new Bank(size,"Canara");
		boolean flag=true;
		while(flag){
			System.out.println("Enter 1 to add customer \nEnter 2 to display List \nEnter 3 to exit");
			int ch=read.nextInt();
			switch(ch) {
			case 1:
				read.nextLine();
				System.out.println("Enter name of customer");
				String name=read.nextLine();
				Customer c=new Customer(name);
				bank.addCustomer(c);
				break;
			case 2:
				bank.displayCustomer();
				break;
			case 3:
				flag=false;
				break;
			}	
		}	
	}

}
