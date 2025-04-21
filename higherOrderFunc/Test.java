package higherOrderFunc;

public class Test {
	static void greet(Demo d) {
		d.print();
	}
	public static void main(String[] args) {
		greet(()->System.out.print("Hello"));
	}

}
