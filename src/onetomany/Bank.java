package onetomany;

public class Bank {
	Customer[] customersArr;
	String bankname;
	static int count=0;
	
	public Bank(int size,String bankname) {
		this.customersArr=new Customer[size];
		this.bankname=bankname;
	}
	public void addCustomer(Customer c) {
		if(count<customersArr.length) {
			customersArr[count++]=c;
			System.out.println("customer added");
		}
		else {
			System.out.println("customer not added,, array full");
		}
	}
	public void displayCustomer() {
		for(int i=0;i<count;i++) {
			System.out.println(customersArr[i].customerName);
		}
	}
	

}
