package circularLinkedList;

public class CircularSinglyLinkedList {
	Node head;
	Node temp;
	static int count;
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			temp=node;
			node.next=head;
			count++;
		}
		else {
			temp.next=node;
			temp=node;
			temp.next=head;
			count++;
		}
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			Node current=head;
			do {
				System.out.println(current.data+" ");
				current=current.next;
			}while(current!=head);
			
				
			}
		}
	public void insertAt(int data, int position) {
		if(position<1) {
			System.out.println("Invalid position");
			return;
		}
		if(position>count) {
			System.out.println("position out of bound");
			return;
		}
		if(position==1) {
			Node node=new Node(data);
			if(head==null) {
				head=node;
				temp=node;
				temp.next=node;
				count++;	
			}
			else {
				node.next=head;
				head=node;
				temp.next=head;
				count++;
			}
			return;
		}
		if(position==count) {
			Node node=new Node(data);
			Node current=head;
			int i=1;
			while(i<count-1) {
				current=current.next;
				i++;
			}
			current.next=temp;
			node.next=temp;
			count++;
			return;
			
			
		}
		/*
		 * if(position==count) { Node node=new Node(data); temp.next=node; temp=node;
		 * temp.next=head; count++; return; }
		 */
		Node current=head;
		int index=1;
		while(current.next!=head) {
			if(index==position-1) {
				Node node=new Node(data);
				node.next=current.next;
				current.next=node;
				count++;
				return;
			}
			index++;
			current=current.next;
		}
	}
	public void update(int data,int position) {
		if(position==count) {
			temp.data=data;
			return;
		}
		if(position==1) {
			head.data=data;
			return;
		}
		if(position<0 || position>=count) {
			System.out.println("Postion not valid, Index out of Bound");	
			return;
	}
		Node current=head;
		int index=1;
		
		while(current.next!=head) {
			if(index==position) {
				current.data=data;
				return;
			}
			index++;
			current=current.next;
		}
}
	public void delete(int position) {
		if(position<0 || position>=count) {
			System.out.println("Postion not valid, Index out of Bound");	
			return;
	}
		if(head==null) {
			System.out.println("no data to delete");
		}
		Node lastnode=head;
		//do {
		//	lastnode=lastnode.next;
		//}while(lastnode!=head);
		
		if(position==1) {
			Node current=head;
			head=head.next;
			current.next=null;
			temp.next=head;
			count--;
			return;	
		}
		if(position==count) {
			Node current=head;
			while(current.next.next!=head) {
				current=current.next;
			}
			current.next=head;
			temp=current;
			
		}
		
	}
}

