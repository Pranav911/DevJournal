package com.codinjans.datastructures;

public class StackArrImpl {
	ArrayImpl arrStack = new ArrayImpl();
	
	public void push(int element) {
		arrStack.insertAtEnd(element);
	}
	
	public void pop() {
		arrStack.deleteAtEnd();
	}
	
	public int peek() {
		return arrStack.peek();
	}
	
	public boolean isEmpty() {
		return arrStack.isEmpty();
	}
	
	public void print() {
		arrStack.print();
	}
	
	public static void main(String[] args) {
		StackArrImpl stack = new StackArrImpl();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.print();
		System.out.println(stack.peek());
		stack.pop();
		stack.print();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
	}
}
