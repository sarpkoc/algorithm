package com.leetcode.medium;

//leetcode #487
public class MaxConsecutiveOnesII {
	
	public static void main(String[] args) {
		MaxConsecutiveOnesII max = new MaxConsecutiveOnesII();
		int[] arr = {1,1,0,1,1,1};
		System.out.println(max.findMaxConsecutiveOnes(arr));			
	}
	
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, cur = 0, cnt = 0;
        for (int i = 0; i < nums.length; i ++) {
            cnt ++;
            if (nums[i] == 0) {
                cur = cnt;
                cnt = 0;
            } 
            res = Math.max(res, cnt + cur);
        }
        return res;
    }
}
