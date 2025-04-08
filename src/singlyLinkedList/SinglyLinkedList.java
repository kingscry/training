package singlyLinkedList;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data){
		Node node1=new Node(data);
		if(head==null) {//for the first node
			head=node1;
			tail=node1;
			count++;
		}
		else {
			tail.next=node1;//for rest of the node
			tail=node1;
			count++;
		}
		
	}
	public void display() {
		if(head==null) {
			System.err.println("No data to display");
			return;
		}
		else {
			Node current=head;
			while(current!=null) {
				System.err.println(current.data);
				current=current.next;
			}
		}
	}
	public void update(int p,int newdata) {
		Node up=head;
		if(head==null) {
			System.out.println("no data to update");
			return;
		}
		if(p==count) {
			tail.data=newdata;
			return;
		}
		if(p==1) {
			head.data=newdata;
			return;
		}
		if(p<0 || p>=count) {
			System.out.println("Postion not valid, Index out of Bound");	
			return;
		}
		int index=1;
		while(index<p) {
			up=up.next;
		    index++;
		}
		System.out.println("Node at position: "+p+"\nOld Data: "+up.data+"\nNew Data: "+newdata);
		up.data=newdata;
	}
	public void insertAt(int newdata,int p) {
		Node node2=new Node(newdata);
		if(head==null) {	
			head=node2;
			tail=node2;
			count++;
			return;	
		}
		if(p==1) {
			node2.next=head;
			head=node2;
			count++;
			return;
		}
		Node temp=head;
		for(int i=0;i<=count;i++) {
			if(i==p-1) {
				node2.next=temp.next;
				temp.next=node2;
				count++; 
				return;	
			}
			temp=temp.next;
			
		}
				
	}
	public void delete(int p) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(p==0) {
			head=head.next;
			return;	
		}
		Node temp=head;
		int ci=1;
		while(temp!=null && ci<p-1) {
			temp=temp.next;
			ci++;
		}
		if(temp==null || temp.next==null) {
			System.out.println("position out of bound");	
			return;
		}
		temp.next=temp.next.next;		
	}

}
