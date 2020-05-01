package com.devjournal.datastructures;

public class LInkedLIstImpl {
//	(head)0->1->2->3->null
//	Insertion -> Begin, End, Pos
//	Deletion -> Begin, End, Pos
	
	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	
	private void insertAtBegin(int element) {
		Node newNode = new Node(element, null);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next = head;
		head=newNode;
	}
	
	private void insertAtEnd(int element) {
		Node newNode = new Node(element, null);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	private void insertAtPos(int element, int pos) {
		if(pos<1) {
			System.out.println("Invalid insert position");
			return;
		}
		
		Node newNode = new Node(element, null);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		int size = getSize();
		if(size+1<pos) {
			System.out.println("Invalid insert position");
			return;
		}
		
		Node temp = head;
		for(int i=0; i<pos-2; i++) {
			temp=temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	
	private void deleteAtBegin() {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		head = head.next;
	}
	
	private void deleteAtEnd() {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		if(head.next==null) {
			head=null;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next=null;
	}
	
	private void deleteAtPos(int pos) {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		int size = getSize();
		if(size<pos) {
			System.out.println("Invalid delete position");
			return;
		}
		if(pos==1) {
			head = head.next;
			return;
		}
		Node temp = head;
		for(int i=0; i<pos-2; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	private int getSize()
	{
		Node temp = head;
		int size = 0;
		while(temp!=null) {
			temp=temp.next;
			size++;
		}
		return size;
	}
	
	private void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		LInkedLIstImpl ob = new LInkedLIstImpl();
		ob.insertAtBegin(3);
		ob.insertAtBegin(2);
		ob.insertAtBegin(1);
		ob.insertAtEnd(4);
		ob.insertAtEnd(5);
		ob.insertAtPos(6, 6);
		ob.print();
		ob.deleteAtBegin();
		ob.deleteAtEnd();
		ob.deleteAtPos(2);
		ob.print();
	}
}
