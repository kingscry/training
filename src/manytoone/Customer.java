package manytoone;

public class Customer {
	int id;
	String name;
	Bank bank;
	public Customer(int id,String name,Bank bank) {
		this.id=id;
		this.name=name;
		this.bank=bank;
	}
	public void display() {
		System.out.println(this.id+" "+this.name+" "this.bank.bname);
	}
}
