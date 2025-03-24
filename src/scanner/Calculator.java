package scanner;

import java.util.Scanner;

public class Calculator {
	public static double res;
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter 1 for +\n 2 for -\n 3 for * \n along with num of variables to include like 2 or 3");
		int h=read.nextInt();
		switch (h){
			case 12:
				res=Cal2.add2();
				System.out.println("result="+res);
				break;
			case 13:
			    res=Cal2.add3();
			    System.out.println("result="+res);
			    break;
			case 22:
				res=Cal2.sub2();
				System.out.println("result="+res);
				break;
			case 23:
				res=Cal2.sub3();
				System.out.println("result="+res);
				break;
			case 32:
				res=Cal2.mul2();
				System.out.println("result="+res);
				break;
			case 33:
				res=Cal2.mul3();
				System.out.println("result="+res);
				break;
			default:
				System.out.println("wrong choice");
		}
	}	
}

