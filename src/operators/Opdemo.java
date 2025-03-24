package operators;

public class Opdemo {
	public static void main(String []args) {
		int num1=10;
		long l =1000;
		double dd=l;
		float ff=l;
		System.out.println(ff);
		System.out.println(dd);
		/*if(num1>0) {
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
		}*/
		/*
		 * String s1="Hell"; String s2="Hell"; System.out.println(s1==s2 &&
		 * true==false);
		 * 
		 */	
		//} 
//		String s=10>20?"10 is greater":"20 is greater";
//		System.out.println(s);
//		int a,b,c;
//		a=10;
//		b=20;
//		c=5;
//		int p=a>b && a>c?a:(b>c?b:c);
//		System.out.println(p);
//		
//		int n=10>20?10:20;
//		System.out.println(n);
		byte b=10;
	    //b=b+1;   error
		b+=1;
		int x=(int)'a';
		System.out.println(x);
		char ch=(char)102;
		System.out.println(ch);
		int rr=104;
		char ch1=(char)rr;
		System.out.println(ch1);
		double ddd=123.23d;	
		char ch2=(char)ddd;
		System.out.println(ch2);
	}
}
