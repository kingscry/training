package aggregation;

public class BDriver {
	public static void main(String[] args) {
		Customer c=new Customer("anu");
		Bank b=new Bank("bandhan bank",c);
		b.display();
		b=null;
		System.out.println(c.custname);
	}

}
