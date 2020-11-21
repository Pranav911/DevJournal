package com.codinjans.datastructures;

public class QueueLLImpl {
	
	private class Node{
		int data;
		Node next;
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node front=null, rear=null;
	
	// At the end of Linked List
	public void enqueue(int element) {
		Node newNode = new Node(element, null);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	// At the beginning of linked list
	public void dequeue() {
		if(front==rear) {
			front = null; rear = null;
			return;
		}
		front = front.next;
	}
	
	public boolean isEmpty() {
		return (front==null && rear==null)?true:false;
	}
	
	public int peek() {
		return front.data;
	}
	
	public void print() {
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		QueueLLImpl queue = new QueueLLImpl();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println(queue.peek());
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}
}
