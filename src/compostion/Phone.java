package compostion;

public class Phone {
	String name;
	Battery b;
	public Phone(String phonename,String type) {
		this.name=phonename;
		this.b=new Battery(type);
	}
	public void display() {
		System.out.println(this.name+" "+b.type);
	}
}
