package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		NextGreaterElement next = new NextGreaterElement();
		
		System.out.println(next.nextGreaterElement(nums1, nums2));
	}
	
	
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for (Integer num : nums2) {
    		while(!stack.empty() && stack.peek() < num) {
    			map.put(stack.pop(), num);
    		}   		
    		stack.push(num);
    	}
    	
    	for (int i = 0; i < nums1.length; i++) {
    		nums1[i] = map.getOrDefault(nums1[i], -1);
		}
    	
    	return nums1;
    }
}
