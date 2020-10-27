package com.leetcode.chapter.array;

//leetcode #27
public class DeletingItemsFromArray {
	public static void main(String[] args) {
		int[] inputs = {0,1,2,2,3,0,4,2};
		DeletingItemsFromArray remove = new DeletingItemsFromArray();
		int len = remove.removeElement(inputs, 2);
		for (int i = 0; i < len; i++) {
		    System.out.println(inputs[i]);
		}
	}
	
	public int removeElement(int[] nums, int val) {
        int index = 0;
        int size = nums.length;
        
        for (int i = 0; i < size; i++) {
        	if (nums[i] != val) {
        		nums[index++] = nums[i];
        	}        	
		}
        
        return index;
    }
}
