package com.leetcode.chapter.array;

//leetcode #26
public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicateFromSortedArray remove = 
				new RemoveDuplicateFromSortedArray();

		int[] ints = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(remove.removeDuplicatesWithModifying(ints));

	}
	
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}

	public int removeDuplicatesWithModifying(int[] nums) {
		int counter = 0;
		int previousInt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {				
				counter++;
			} else {
				if (nums[i] != previousInt) {
					counter++;
				}
			}
			previousInt = nums[i];
		}
		return counter;
	}
}
