package com.devjournal.datastructures;

public class StackLLImpl {
LInkedLIstImpl llStack = new LInkedLIstImpl();
	
	public void push(int element) {
		llStack.insertAtBegin(element);;
	}
	
	public void pop() {
		llStack.deleteAtBegin();
	}
	
	public int peek() {
		return llStack.peek();
	}
	
	public boolean isEmpty() {
		return llStack.isEmpty();
	}
	
	public void print() {
		llStack.print();
	}
	
	public static void main(String[] args) {
		StackLLImpl stack = new StackLLImpl();
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
