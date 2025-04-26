package manytoone;

public class Driver {
	public static void main(String[] args) {
		Bank bank=new Bank("SBI");
		Customer c1=new Customer(1,"raj",bank);
		
	}

}
