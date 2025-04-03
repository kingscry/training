package ExceptionHandling;

public class TrowKeyword {
public static void div(int x, int y) throws Exception {
	if(y!=0) {
		System.out.println(x/y);
	}else {
		throw new Exception("Denomination is zero");
	}//thorw can be used inside a method body
}// for one keyword  we can throw one keyword only
public static void main(String[] args) {
	div(10, 0);
}
}
