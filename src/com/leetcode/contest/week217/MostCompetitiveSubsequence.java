package com.leetcode.contest.week217;

import java.util.Stack;

//leetcode #1673
public class MostCompetitiveSubsequence {
	
	public static void main(String[] args) {
		MostCompetitiveSubsequence most = new MostCompetitiveSubsequence();
		int[] nums = {3, 5, 2, 6};
		
		int[] result = most.mostCompetitive(nums, 2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

    public int[] mostCompetitiveTLE(int[] nums, int k) {
        int[] result = new int[k];
    	int minIndex = - 1;
        for (int i = 0; i < k; i++) {
        	int tempMin = - 1;
			for (int j = minIndex + 1; j < nums.length - k + i + 1; j++) {
				if (tempMin == -1 || nums[j] < tempMin) {
					tempMin = nums[j];
					minIndex = j;
				}
			}
			
			result[i] = tempMin;
		}
        
        return result;
    }
    
    public int[] mostCompetitive(int[] nums, int k) {
        int[] result = new int[k];
        Stack<Integer> stack = new Stack<Integer>();
        
        int size = nums.length;
    	for (int i = 0; i < size; i++) {
    		
    		while(stack.size() > 0 && nums[i] < nums[stack.peek()] && size - i > k - stack.size() ) {
    			stack.pop();
    		}
    		
    		if (stack.size() < k) {
    			stack.push(i);
    		}
		}
    	
    	
        for (int i = k; i > 0; i--) {
        	result[i - 1] = nums[stack.pop()];
		}
        
        return result;
    }
}
