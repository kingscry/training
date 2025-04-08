package method_chaining;

public class Student {
	String name;
	int id;
	public Student setName(String name) {
		this.name=name;
		return this;//this got the address of currently existing objects.
		
	}
	public Student setId(int id){
		this.id=id;
		return this;
	}
	public void display() {
		System.out.println(this.name+" "+this.id);
	}

}
