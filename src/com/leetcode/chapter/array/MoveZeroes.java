package com.leetcode.chapter.array;

//leetcode #283
public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes move = new MoveZeroes();
		int[] arr = {0,1,0,3,12};
		move.moveZeroes(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int index = 0;
        for (int i = 0; i < size; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
        
        for (int k = index; k < nums.length; k++) {
        	nums[k] = 0;
		}
        
    }

}
