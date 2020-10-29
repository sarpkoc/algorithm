package com.leetcode.chapter.array;

//leetcode #485
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		MaxConsecutiveOnes max = new MaxConsecutiveOnes();
		int[] arr = {1,1,0,1,1,1};
		System.out.println(max.findMaxConsecutiveOnes(arr));
		
		
	}

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax = 0;
        for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				tempMax++;
				if (tempMax > max) {
					max = tempMax;					
				}
			} else {
				tempMax = 0;
			}
		}
        
        return max;
    }
}
