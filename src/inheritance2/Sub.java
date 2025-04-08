package inheritance2;

public class Sub extends Super{
	double a=11.11;
	static double b=17.77;
	void print() {
		int a=100;
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(Super.b);
		
	}

}
