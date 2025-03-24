package static_nonstatic_initializers;

public class Demo {
	static {
		System.out.println("1st multiline static initializers");
	}
	static {
		System.out.println("2nd multiline static initializers");
	}
	static {
		System.out.println("3rd multiline static initializers");
	}
	public Demo() {
		System.out.println("constructor");
	}
	{
		System.out.println("non static initializers");
	}
	public static void main(String[] args) {
		System.out.println("main");
		Demo d1=new Demo();
	}

}
