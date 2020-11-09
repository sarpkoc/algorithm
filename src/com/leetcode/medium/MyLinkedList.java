package com.leetcode.medium;

//leetcode #707
public class MyLinkedList {

	private int length;
	private Node head;

	class Node {
		Integer val;
		Node next;
		Node(Integer x) {
			this.val = x;
		}
	}

	/** Initialize your data structure here. */
	public MyLinkedList() {
		this.length = 0;
		this.head = null;
	}

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {
		if (index < 0 || index >= this.length) return -1;

		Node current = head;
		int value = current.val;

		for (int i = 1; i < index + 1; i++) {
			current = current.next;
			value = current.val;
		}

		return value;
	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	public void addAtHead(int val) {
		Node prevNode = head;
		head = new Node(val);
		head.next = prevNode;
		this.length++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (this.length == 0) {
			addAtHead(val);
		}

		Node newNode = new Node(val);
		newNode.next = null;

		Node temp = head;

		while (temp.next != null) {  		
			temp = temp.next;
		}
		temp.next = newNode;

		this.length++;
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	public void addAtIndex(int index, int val) {
		if (index < 0 || index > this.length) return;

		Node newNode = new Node(val); 	
		Node temp = head;

		if (index == 0) {
			addAtHead(val);
		} else {
			for (int i = 0; i < index -1 ; i++) {
				temp = temp.next;	
			}
			newNode.next = temp.next;
			temp.next = newNode;    
			this.length++;
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= this.length) return;

		this.length--;
		
		if (index == 0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;	
		}

		temp.next = temp.next.next;

	}


	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(4);
		System.out.println(myLinkedList.get(1));
		myLinkedList.addAtHead(1);
		myLinkedList.addAtHead(5);
		myLinkedList.deleteAtIndex(3);	
		myLinkedList.addAtHead(7);
		System.out.println(myLinkedList.get(3));
		System.out.println(myLinkedList.get(3));
		System.out.println(myLinkedList.get(3));
		myLinkedList.addAtHead(1);
		myLinkedList.deleteAtIndex(4);



	}

}
