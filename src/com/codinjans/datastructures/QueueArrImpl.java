package com.codinjans.datastructures;

public class QueueArrImpl {

	private int[] arr = new int[5];
	private int front = -1, rear = -1;
	
	public void enqueue(int element) {
		if(isEmpty()) {
			front++; rear++;
			arr[rear] = element;
			return;
		}
		if(rear==arr.length-1) {
			System.out.println("Queue is already full");
			return;
		}
		arr[++rear] = element;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return;
		}
		if(front==rear) {
			front=-1; rear=-1;
			return;
		}
		front++;
	}
	
	public boolean isEmpty() {
		return (front==-1 && rear==-1)?true:false;
	}
	
	public int peek() {
		return isEmpty()?-111:arr[rear];
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return;
		}
		for(int i=front; i<rear;i++) {
			System.out.print(arr[i] + " - ");
		}
		System.out.println(arr[rear]);
	}
	
	public static void main(String[] args) {
		QueueArrImpl queue = new QueueArrImpl();
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
