package com.dsa.sort;

public class StackImpl {
	
	int stack[] = new int[5];
	int top =0;
	
	private int size() {
		return top;
	}
	
	private boolean isEmpty() {
		return top<=0;
	}
	private void push(int data) {
		if(top ==5) {
			System.out.println("Stack is full, you cant push data");
		}else {
		stack[top] = data;
		top++;
		}
	}
	private int pop() {
		int data =0;
		if(isEmpty()) {
			System.out.println("Stack is Empty, you cant pop data");
		}else {
		top --;
		data = stack[top];
		stack[top] =0;
		}
		return data;
	}
	
	private int peek() {
		
		return stack[top-1];
		
	}

	private void show() {
		for(int i : stack) {
			System.out.print(i +" ");
		}
	}
	public static void main(String[] args) {
		
		StackImpl stack = new StackImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("pop "+stack.pop());
		System.out.println("peek "+stack.peek());
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println("pop "+stack.pop());
		System.out.println("peek "+stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.show();
	}

}
