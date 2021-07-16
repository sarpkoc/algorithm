package com.leetcode.medium;

//leetcode #910
public class SmallestRangeII {
	
	public static void main(String[] args) {
		SmallestRangeII small = new SmallestRangeII();
		int[] nums = {1};
		System.out.println(small.smallestRangeII(nums,0));
	}

	
    public int smallestRangeII(int[] A, int K) {
    	int size = A.length;
    	if (size == 0) return 0;
    	    	
        int min = Math.abs(A[0] - K);
        int max = Math.abs(A[0] - K);
        
        for (int i = 1; i < A.length; i++) {
			int temp = Math.abs(A[i] - K);
			min = Math.min(temp, min);
			max = Math.max(temp, max);
		}
        
        
        return max - min;
    }
}

