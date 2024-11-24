package com.dsa.sort;

public class DynamicStackImpl {
	
	int capacity =2;
	int stack[] = new int[capacity];
	int top =0;
	
	private int size() {
		return top;
	}
	
	private boolean isEmpty() {
		return top<=0;
	}
	private void push(int data) {
		if(size() == capacity) {
			expandStackSize();
		}
		stack[top] = data;
		top++;
	}
	private void expandStackSize() {
		int length = size();
		int [] dynamicStack = new int[capacity * 2];
		//System.arraycopy(stack, 0, dynamicStack, 0, length);
		for(int i=0;i<top;i++) {
			dynamicStack[i]= stack[i];
		}
		stack = dynamicStack;
		capacity *=2;
	}

	private int pop() {
		int data =0;
		if(isEmpty()) {
			System.out.println("Stack is Empty, you cant pop data");
		}else {
			top --;
			data = stack[top];
			stack[top] =0;
			int i = (capacity/2)/2;
			if(size() <= i) {
				shrinkDynamicStack();
			}
		}
		return data;
	}
	
	private void shrinkDynamicStack() {
		capacity = capacity/2;
		int [] dynamicStack = new int[capacity];
		//System.arraycopy(stack, 0, dynamicStack, 0, top/size());
		for(int i=0;i<top;i++) {
			dynamicStack[i]= stack[i];
		}
		stack = dynamicStack;
		
	}

	private int peek() {
		
		return stack[top-1];
		
	}

	private void show() {
		for(int i : stack) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		DynamicStackImpl stack = new DynamicStackImpl();
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.push(20);
		stack.push(10);
		stack.push(20);
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.pop();
		stack.pop();
		stack.show();
		
		
	}

}
