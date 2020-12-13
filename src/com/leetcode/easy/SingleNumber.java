package com.leetcode.easy;

//leetcode #136
public class SingleNumber {
	public static void main(String[] args) {
		SingleNumber single = new SingleNumber();
		
		int[] nums = {4,1,2,1,2};
		System.out.println(single.singleNumber(nums));
	}
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (Integer i : nums) {
        	result ^= i;
        }
        
        return result;
    }
}
