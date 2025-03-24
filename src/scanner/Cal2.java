package scanner;

import java.util.Scanner;

public class Cal2 {
	public static double num1 , num2 , num3;
	public static double add2() {
		Scanner read=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		return num1+num2;
		
	}
	public static double add3() {
		Scanner read=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		num3=read.nextDouble();
		return num1+num2+num3;
		
	}
    public static double sub2() {
    	Scanner read=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		num3=read.nextDouble();
		return num1-num2;
		
	}
    public static double sub3() {
    	Scanner read=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		num3=read.nextDouble();
		return num1-num2-num3;
	
}

    public static double mul2() {
    	Scanner read=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		num3=read.nextDouble();
		return num1*num2;
	
}
    public static double mul3() {
    	Scanner read=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1=read.nextDouble();
		num2=read.nextDouble();
		num3=read.nextDouble();
		return num1*num2*num3;
	
}

}
