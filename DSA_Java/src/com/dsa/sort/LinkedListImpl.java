package com.dsa.sort;

public class LinkedListImpl {

	Node head;
	private void insert(int data) {
	// 1. create a new Node	
		Node node = new Node();
		node.data=data;
		node.next = null;
	// 2. Check if Node is first data inserting - if Yes then refer as head node, If No traverse and add at the end of LL
		if(head == null) {
			head = node;
		}else {
			Node n = head;   // temp Node refers to head Node
			while(n.next != null) {
				n = n.next; 
			}
			n.next = node;   // once we reach to null, adding address to new node created
		}
		
	}
	private void show() {
		
		Node node = head;
		while(node.next !=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	private void insertAtStart(int data) {
		
		Node node = new Node();
		node.data= data;
		node.next = head;
		head = node;
		
	}
	
	private void insertAt(int index, int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0) {   // if index is 0 then insert data at start index
			insertAtStart(data);
		}else {
		Node n = head;
		for(int i=0;i<index -1;i++) {  // index -1 -> becoz index starts from zero
			n = n.next;
		}
		node.next = n.next;           // current node.next referring to index+1 node
		n.next = node;				 // new node is assigned to previous node
		}
	}
	
	private void deleteAt(int index) {
		if(index ==0) {    	// delete first element just change head node reference
			head = head.next;
		}
		else {
			Node n = head;
			Node n1 = null;  
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;       // before removing reference storing in n1
			n.next = n1.next;
			System.out.println("deleting node "+n1.data);
			n1 = null;		  // Nullifying n1 reference so it will be visible to GC
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl ll = new LinkedListImpl();
		ll.insert(18);
		ll.insert(45);
		ll.insert(12);
		ll.insertAtStart(25);
		ll.insertAt(2,50);
		ll.deleteAt(3);
		ll.show();
	}
	
	
	
}
