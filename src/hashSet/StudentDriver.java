package hashSet;
import java.util.HashSet;
public class StudentDriver {
	public static void main(String[] args) {
		HashSet<Student> st=new HashSet<>();
		Student p1=new Student("Ateeb",10);
		Student p2=new Student("Ateeb",10);
		Student p3=new Student("john",1);
		Student p4=new Student("bob",2);
		Student p5=new Student("teeb",3);
		st.add(p5);
		st.add(p1);
		st.add(p2);
		st.add(p3);
		st.add(p4);
		System.out.println(st);
	}

}
