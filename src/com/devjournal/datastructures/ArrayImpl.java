package com.devjournal.datastructures;

public class ArrayImpl {
	// 1,2,3,4,5, 
	// Insertion -> end, begin, pos <-Deletion
	
	int capacity = 5;
	int[] arr = new int[capacity];
	int size = -1;
	
	private void insertAtBegin(int element) {
		if(size+1==capacity) {
			resize();
		}
		for(int i=size; i>=0; i--) {
			arr[i+1] =arr[i];
		}
		arr[0] = element;
		size++;
	}
	
	private void insertAtEnd(int element) {
		if(size+1==capacity) {
			resize();
		}
		arr[size+1] = element;
		size++;
	}
	
	private void insertAtPos(int element, int pos) {
		if(pos<1 || pos>size+2) {
			System.out.println("Invalid position");
			return;
		}
		if(size+1==capacity) {
			resize();
		}
		for(int i=size; i>=pos-1; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos-1] = element;
		size++;
		
	}
	
	private void deleteAtBegin() {
		if(size==-1) {
			System.out.println("underflow");
			return;
		}
		for(int i=0; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}
	
	private void deleteAtEnd() {
		if(size==-1) {
			System.out.println("Underflow");
			return;
		}
		size--;
	}
	
	private void deleteAtPos(int pos) {
		if(size==-1) {
			System.out.println("Underflow");
			return;
		}
		if(pos<1 || pos>size+1) {
			System.out.println("Invalid position for deletion");
			return;
		}
		for(int i=pos-1; i<size; i++) {
			arr[i]=arr[i+1];
		}
		size--;
		
	}

	private void resize() {
		int[] tempArr = new int[capacity*2];
		for(int i=0; i<capacity; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		capacity *= 2;
	}
	
	private void print() {
		for(int i=0; i<=size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayImpl ob = new ArrayImpl();
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
