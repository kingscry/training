package scanner;
import java.util.Scanner;
public class else_if {
	public static void main(String[] args) {
			
		Scanner read=new Scanner(System.in);
		System.out.println("enter no");
        int num1=read.nextInt();
        if(num1>0) {
			if(num1%2==0) {
				System.out.print("+ even");
			}
			else {
				System.out.print("+ odd");
			}
		}
		else {
			if(num1%2==0) {
				System.out.print("- even");
			}
			else { 
				System.out.print("- odd");

		
	}
		}
}
}
