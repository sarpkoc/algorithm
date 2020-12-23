package com.leetcode.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class NextGreaterElementIII {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pr.add(3);
		pr.add(5);
		pr.add(1);
				
		System.out.println(pr.poll());
		System.out.println(pr.poll());
		System.out.println(pr.poll());
	}

    public int nextGreaterElement(int n) {
    	PriorityQueue<Integer> pr = new PriorityQueue<Integer>(Collections.reverseOrder());
    	
    	int temp = n;
    	while (temp != 0) {
    		pr.add(temp % 10);
    		
    		temp = temp / 10;
    	}
    	
    	return 0;
    }
}
