package com.leetcode.easy;

//leetcode #80
public class RemoveDuplicateTwoFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicateTwoFromSortedArray remove = 
				new RemoveDuplicateTwoFromSortedArray();

		int[] ints = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(remove.removeDuplicates(ints));

	}
	
	public int removeDuplicates(int[] nums) {
		if (nums.length == 1) return 1;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {	  
	    	if (j == 1) {
	    		i++;
	    	} else if (nums[j] != nums[i - 1]) {
	    		i++;
	            nums[i] = nums[j];
	    	}
	    }
	    return i + 1;
	}
}
