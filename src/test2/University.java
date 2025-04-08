package test2;

public class University {
	Person[] prr;
	static int count=0;
	public University() {
		this.prr=new Person[10];
	}
	
	void addPerson(Person p) {
		if(count<prr.length) {
			prr[count++]= p;
			//System.out.println();
		}
		
	}
	void showPeople() {
		for(int i=0;i<count;i++) {
			System.out.println("Name:"+prr[i].name);
			System.out.println("Age:"+prr[i].age);	
	}
}
}
