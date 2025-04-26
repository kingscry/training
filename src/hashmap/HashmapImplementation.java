package hashmap;
import java.util.*;
public class HashmapImplementation {
	final int size=16;
	Entry[] buckets=new Entry[size];
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	public void put(int key,int value) {
		int index=getBucketIndex(key);
		Entry nodeNewEntry=new Entry(key,value);
		System.out.println("Entry added: "+index);
		Entry current=buckets[index];
	
		while(current!=null) {
			if(current.key==key) {
				current.value=value;
				return;
			}
				current=current.next;
			}
			nodeNewEntry.next=buckets[index];
			buckets[index]=nodeNewEntry;
		}
	
	public void displayValueByKey(int key) {
		try {
			int value=getValue(key);
			System.out.println("key: "+key+" value; "+value);
		}catch(NoSuchElementException e) {
			System.out.println("not found");
		}
	}
		
	public int getValue(int key) {
		int index=getBucketIndex(key);
		Entry current= buckets[index];
		while(current!=null) {
			if(current.key==key) {
				return current.value;
			}
			current=current.next;
		}
		throw new NoSuchElementException("key "+key+" not found in hashmap");
		
	}
	public void remove(int key) {
		int index=getBucketIndex(key);
		Entry current=buckets[index];
		Entry prev=null;
		while(current!=null) {
			if(current.key==key) {
				if(prev==null) {
					buckets[index]=current.next;
				}
				else {
					prev.next=current.next;
				}
				System.out.println("key: "+key+" removed successfully");
				return;
			}
			prev=current;
			current=current.next;
		}
		throw new NoSuchElementException("key "+key+" not found. Cannot remove");
		
	}
	public void display() {
		System.out.println("hashmap content: ");
		for(int i=0;i<buckets.length;i++) {
			Entry current=buckets[i];
			if(current!=null) {
				System.out.println("bucket "+i+": ");
				while(current!=null) {
					System.out.println(current.key+"="+current.value);
					current=current.next;
				}
				System.out.println();
			}
			
		}
	}
	public static void main(String[] args) {
		HashmapImplementation map=new HashmapImplementation(); 
		map.put(10,1);
		map.put(20,9);
		System.out.println("Value at key 10: "+map.getValue(10));
		System.out.println("Value at key 10: "+map.getValue(20));
		map.put(30,91);
		map.put(20,777);
		map.put(20,66);
		map.put(20,91);
		map.put(40,9);
		map.put(40,90);
		System.out.println("Value at key 10: "+map.getValue(40));
		map.put(40,228);
		map.put(50,228);
		map.displayValueByKey(20);
		map.remove(20);
		map.displayValueByKey(40);
		map.display();
	}
}

