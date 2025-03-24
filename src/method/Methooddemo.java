	package method;
	
	public class Methooddemo {
		public static void main(String []args) {
			add(10,24,35,56);
			add(12,34);
			byte x=3;
			byte y=7;
			add(x,y);
			add(10,34,57.7f);
		}
		
		//method overloading
		public static void add(int a,int b) {
			System.out.println(a+b);
		}
		public static void add(int a,int b,int c,int d) {
			System.out.println(a+b+c+d);
		}
		public static void add(byte a,byte b) {
			System.out.println("third");
			System.out.println(a+b);
		}
		public static void add(int a,int b,float c) {
			System.out.println("second");
			System.out.println(a+b+c);
		}
		public static void add(float a,float b,float c) {
			System.out.println("last");
			System.out.println(a+b+c);
		}
			
}
