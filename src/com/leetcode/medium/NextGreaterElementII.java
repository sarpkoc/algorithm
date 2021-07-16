package com.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
	public static void main(String[] args) {
		int[] nums1 = {100,1,11,1,120,111,123,1,-1,-100};
		NextGreaterElementII next = new NextGreaterElementII();

		System.out.println(next.nextGreaterElements(nums1));
	}
	
	
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
		int[] next = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }   
        return next;
    }
}
