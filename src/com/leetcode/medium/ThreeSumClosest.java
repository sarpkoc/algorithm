package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode #16
public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] inputs = {-1,2,1,-4};

		ThreeSumClosest three = new ThreeSumClosest();
		System.out.println(three.threeSum(inputs, 1));
	}

	public int threeSum(int[] nums, int target) {
		int difference = Integer.MAX_VALUE;
		int result = 0;

		Arrays.sort(nums);                
		int size = nums.length;

		for (int i = 0; i < size - 2; i++) {
			int lowerIndex = i + 1;
			int highIndex = size - 1;		

			while (lowerIndex < highIndex){
				int temp = nums[lowerIndex] + nums[highIndex] + nums[i];
				
				if (temp == target) return target;
				
				if (temp < target){
					lowerIndex++;
				} else {
					highIndex--;
				}	
				
				int dif = Math.abs(target - temp);
				if (dif < difference) {
					result = temp;
					difference = dif;
				}
			}
		}     

		return result;
	}
}
