package onetomany;

public class Post {
	User[] usArr;
	String pname;
	static int c=0;
	public Post(int size,String pname) {
		this.usArr=new User[size];
		this.pname=pname;
	}
	public void addUser(User u) {
		if(c<usArr.length) {
			usArr[c++]=u;
			System.out.println("User added");
		}
		else {
			System.out.println("Array full, user connot be added");
		}	
	}
	public void display() {
		for(int i=0;i<c;i++) {
			System.out.println(usArr[i].username);
		}
		
	}

}
