package com.devjournal.datastructures;

public class ArrayImpl {
	private int capacity = 5;
	private int[] arr = new int[capacity];
	private int size = -1;
	
	// O(n)
	public void insertAtBegin(int element) {
		if(size+1 == capacity) {
			resize();
		}
		for(int i=size; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = element;
		size++;
	}
	
	// O(1)
	public void insertAtEnd(int element) {
		if(size+1 == capacity) {
			resize();
		}
		arr[size+1] = element;
		size++;
	}
	
	// O(n)
	public void insertAtPos(int element, int pos) {
		if(pos < 1 || pos > size+2) {
			System.out.println("Invalid position");
			return;
		}
		if(size+1 == capacity) {
			resize();
		}
		for(int i=size; i>=pos-1; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos-1] = element;
		size++;
		
	}
	
	// O(n)
	public void deleteAtBegin() {
		if(size == -1) {
			System.out.println("underflow");
			return;
		}
		for(int i=0; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}
	
	// O(1)
	public void deleteAtEnd() {
		if(size==-1) {
			System.out.println("Underflow");
			return;
		}
		size--;
	}
	
	// O(n)
	public void deleteAtPos(int pos) {
		if(size==-1) {
			System.out.println("Underflow");
			return;
		}
		if(pos < 1 || pos > size+1) {
			System.out.println("Invalid position for deletion");
			return;
		}
		for(int i=pos-1; i<size; i++) {
			arr[i]=arr[i+1];
		}
		size--;
		
	}

	// O(n)
	public void resize() {
		int[] tempArr = new int[capacity*2];
		for(int i=0; i<capacity; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		capacity *= 2;
	}
	
	// O(n)
	public void print() {
		for(int i=0; i<=size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return size==-1?true:false;
	}
	
	public int peek() {
		return isEmpty()?-111:arr[size];
	}
	
	public static void main(String[] args) {
		ArrayImpl ob = new ArrayImpl();
		// 1 2 3 4 5 6
		// 2 4 5
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
