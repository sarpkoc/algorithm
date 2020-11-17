package com.leetcode.easy;

import com.leetcode.util.ListNode;

//leetcode #21
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l12.next = l13;
		l11.next = l12;
		
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l33 = new ListNode(4);
		l22.next = l33;
		l21.next = l22;
		
		MergeTwoSortedLists merge = new MergeTwoSortedLists();		
		
		ListNode result = merge.mergeTwoLists(l11, l21);
	}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
        	return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        
        while (l1 != null || l2 != null) {
        	if (l1 == null) {
        		node.next = l2;
        		l2 = l2.next;
        	} else if (l2 == null) {
        		node.next = l1;
        		l1 = l1.next;
        	} else {
        		if (l1.val < l2.val) {
        			node.next = l1;
        			l1 = l1.next;
        		} else {
        			node.next = l2;
        			l2 = l2.next;
        		}
        	}      	
        	node = node.next;
        }
        
        return dummy.next;
        
    }
}
