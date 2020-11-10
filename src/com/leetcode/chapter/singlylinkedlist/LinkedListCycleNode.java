package com.leetcode.chapter.singlylinkedlist;

import com.leetcode.util.ListNode;

//leetcode #142
public class LinkedListCycleNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);

		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(-4);
		
		node2.next = node3;
		node1.next = node2;
		head.next = node1.next;
		
		node3.next = node1;
		
		LinkedListCycleNode cycle = new LinkedListCycleNode();
		System.out.println(cycle.detectCycle(head));
		
		ListNode head1 = new ListNode(5);
		System.out.println(cycle.detectCycle(head1));
		
		ListNode try1 = new ListNode(1);		
		ListNode try2 = new ListNode(2);
		try1.next = try2;
		System.out.println(cycle.detectCycle(try1));
	}
	
	public ListNode detectCycle(ListNode head) {
		if (head == null) return null;
		 
        ListNode slow = head;
        ListNode fast = head;
                               
        while (fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	
        	if (slow == fast) {
        		ListNode slowAnother = head;
        		
        		while (slow != slowAnother) {
        			slow = slow.next;
        			slowAnother = slowAnother.next;
        		}
        		
        		return slow;
        	}        	

        }
        
        return null;
    }

}
