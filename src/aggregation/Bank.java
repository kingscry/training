package aggregation;

public class Bank {
	String bname;
	Customer c;
	public Bank(String bname,Customer c) {
		this.bname=bname;
		this.c=c;
	}
	public void display() {
		System.out.println(this.bname+" "+this.c.custname );
	}

}
