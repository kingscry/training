package hashSet;
import java.util.HashSet;
public class HashsetDemo {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(32.7);
		set.add("hello");
		set.add('d');
		set.add(null);
		set.add(null);
		set.add(10);
		System.out.println(set);
		set.add(10);
		set.add(88);
		set.add("0010");
		System.out.println(set);
		
		
	}

}
