package com.codinjans.datastructures;

public class CircularQueueArrImpl {
	// 1 , 2 , 3, 4
	// front  rear = (rear+1)%n
	
	private int[] arr = new int[3];
	private int front = -1, rear = -1;
	
	public void enqueue(int element) {
		if(isEmpty()) {
			front++; rear++;
			arr[rear] = element;
			return;
		}
		if(rear==front-1 || (front==0 && rear==arr.length-1)) {
			System.out.println("Queue is already full");
			return;
		}
		rear = (rear+1)%arr.length;
		arr[rear] = element;
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
		front=(front+1)%arr.length;
	}
	
	public boolean isEmpty() {
		return (front==-1 && rear==-1)?true:false;
	}
	
	// Throws error on empty queue
	public int peek() {
		return arr[front];
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return;
		}
		if(rear>=front) {
			for(int i=front; i<rear;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[rear]);
		} else {
			for(int i=front; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			for(int i=0; i<=rear;i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		CircularQueueArrImpl queue = new CircularQueueArrImpl();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.print();
		queue.dequeue();
		queue.print();
		System.out.println(queue.peek());
		queue.dequeue();
		queue.enqueue(4);
		queue.enqueue(5);
		queue.print();
		queue.enqueue(6);
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}

}
