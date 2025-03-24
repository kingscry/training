package arithmetic_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		// System.out.println(true+10+"hello"+'k'); error
		System.out.println(10 + 10.75 + "hello" + true + 'k');
		System.out.println();
		byte b = 12 + 7;
		byte c = (byte) 128;
		System.out.println(c);

		System.out.println(b);
		int x = 10;
		long y = 2;
		// int z=x/y;  error
		System.out.println(x / y);
		float f = 10.56f;
		double d = 10.44d;
		//float p=f+d; error 
		/*
		 * int x1=10.5/10; System.out.println(x1);
		 */
		//int r1=10.5/10;   error
		//System.out.println(r1);  error
		int x1=5/2;
		
	}
}
