package com.leetcode.chapter.recursion;

import com.leetcode.util.ListNode;

//leetcode #206
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
        	ListNode nextTemp = head.next;
        	head.next = prev;
        	prev = head;
        	head = nextTemp;
        }
    	
    	return prev;
    }
    
    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
    	ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
    	return prev;
    }
}
