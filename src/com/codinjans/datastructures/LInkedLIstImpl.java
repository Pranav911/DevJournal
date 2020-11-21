package com.codinjans.datastructures;

public class LInkedLIstImpl {
	// (head)0->1->2->3->null
	// Insertion -> Begin, End, Pos
	// Deletion -> Begin, End, Pos

	private class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head = null;

	public void insertAtBegin(int element) {
		Node newNode = new Node(element, null);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int element) {
		Node newNode = new Node(element, null);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void insertAtPos(int element, int pos) {
		if (pos < 1) {
			System.out.println("Invalid insert position");
			return;
		}

		Node newNode = new Node(element, null);
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		int size = getSize();
		if (size + 1 < pos) {
			System.out.println("Invalid insert position");
			return;
		}

		Node temp = head;
		for (int i = 0; i < pos - 2; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void deleteAtBegin() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		head = head.next;
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		if (head.next == null) {
			head = null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	public void deleteAtPos(int pos) {
		if (pos < 1) {
			System.out.println("Invalid insert position");
			return;
		}
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		int size = getSize();
		if (size < pos) {
			System.out.println("Invalid delete position");
			return;
		}
		if (pos == 1) {
			head = head.next;
			return;
		}
		Node temp = head;
		for (int i = 0; i < pos - 2; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	public int getSize() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public void reverseList() {
		Node prev = null;
		Node current = head;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void recursiveReverse(Node p) {
		if (p.next == null) {
			head = p;
			return;
		}
		recursiveReverse(p.next);
		p.next.next = p;
		p.next = null;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void recursivePrint(Node p) {
		if (p != null) {
			System.out.print(p.data + " -> ");
			recursivePrint(p.next);
		} else
			System.out.println("null");
	}
	
	public void recursiveReversePrint(Node p) {
		if (p != null) {
			recursiveReversePrint(p.next);
			System.out.print(p.data + " -> ");
		}
	}

	public boolean isEmpty() {
		return head==null?true:false;
	}
	
	public int peek() {
		return isEmpty()?-111:head.data;
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
		ob.reverseList();
		ob.print();
		ob.recursiveReverse(ob.head);
		ob.recursivePrint(ob.head);
		ob.recursiveReversePrint(ob.head);
	}

}
