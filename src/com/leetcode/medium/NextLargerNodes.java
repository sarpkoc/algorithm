package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.util.ListNode;

//leetcode #1019
public class NextLargerNodes {

	public static void main(String[] args) {
		NextLargerNodes nextLargerNode = new NextLargerNodes();	
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(5);
		node2.next = node3;
		node1.next = node2;
		
		System.out.println(nextLargerNode.nextLargerNodes(node1));

	}

	public int[] nextLargerNodes(ListNode head) {
		ListNode loopNode = head; 
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		int index = 0;
		while (loopNode != null) {
			int nextNumber = loopNode.next != null ? loopNode.next.val : 0;
			map.put(index++, Math.max(nextNumber, loopNode.val));
			index++;
			loopNode = loopNode.next;
		}
		int[] result = new int[index];
		int counter = 0;
		while (head != null) {
			if (head.val == map.get(counter)) {
				result[counter] = 0;
			} else {
				result[counter] = map.get(counter);
			}
			
			head = head.next;	
		}
		
		return result;
	}
}

