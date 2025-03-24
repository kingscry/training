package method;

public class Mathlib {
	public static void main(String[] args) {
		System.out.println(Math.max(10,12));
		System.out.println(Math.min(10,12));
		System.out.println(Math.ceil(10.12));
		System.out.println(Math.floor(10.12));
		System.out.println(Math.round(23.45));
		System.out.println(Math.round(23.55));
		System.out.println(Math.abs(-12));
		System.out.println(Math.subtractExact(10,12));
		
		absolute(subtract(10,20));
		
	}
	
	public static void absolute(int x) {
		System.out.println(Math.abs(x));
	}
	public static int subtract(int x,int y) {
		return Math.subtractExact(x, y);

}
}