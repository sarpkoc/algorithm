package com.leetcode.chapter.singlylinkedlist;

import java.util.HashSet;
import java.util.Set;

import com.leetcode.util.ListNode;

//leetcode #141
public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);

		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(-4);
		
		node2.next = node3;
		node1.next = node2;
		head.next = node1.next;
		
		node3.next = node1;
		
		LinkedListCycle cycle = new LinkedListCycle();
		System.out.println(cycle.hasCycle(head));
		
		ListNode head1 = new ListNode(5);
		System.out.println(cycle.hasCycle(head1));
		
		ListNode try1 = new ListNode(1);		
		ListNode try2 = new ListNode(2);
		try1.next = try2;
		System.out.println(cycle.hasCycle(try1));
	}
	
	public boolean hasCycle(ListNode head) {
		if (head == null) return false;
		 
        ListNode slowHead = head;
        ListNode fastHead = head.next;
                               
        while (slowHead != fastHead) {
        	if (fastHead == null || fastHead.next == null) {
        		return false;
        	}
        	
        	slowHead = slowHead.next;
        	fastHead = fastHead.next.next;
        }
        
        return true;
    }

    public boolean hasCycleHashSet(ListNode head) {
        Set<Integer> list = new HashSet<Integer>();
                  
        while (head != null) {
        	if (!list.contains(head.val)) {
        		list.add(head.val);
        	} else {
        		return true;
        	}
        	
        	head = head.next;
        }
        
        return false;
    }
}
