package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode #15
public class ThreeSum {
	public static void main(String[] args) {
		int[] inputs = {-2,0,0,2,2};
		
		ThreeSum three = new ThreeSum();
		System.out.println(three.threeSum(inputs));
	}
	
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
               
        Arrays.sort(nums);                
        int size = nums.length;
        
        for (int i = 0; i < size - 2; i++) {
			if (i == 0 || (nums[i] != nums[i - 1])) {
				int lowerIndex = i + 1;
				int highIndex = size - 1;
				int sum = 0 - nums[i];			
				
				while (lowerIndex < highIndex){
					if (nums[lowerIndex] + nums[highIndex] == sum) {
						result.add(Arrays.asList(nums[i], nums[lowerIndex], nums[highIndex]));
					
						while (lowerIndex < highIndex && nums[lowerIndex] == nums[lowerIndex + 1]) lowerIndex++;
						while (lowerIndex < highIndex && nums[highIndex] == nums[highIndex - 1]) highIndex--;
						
						lowerIndex++;
						highIndex--;												
					} else if (nums[lowerIndex] + nums[highIndex] < sum){
						lowerIndex++;
					} else {
						highIndex--;
					}					
				}
			}			
		}     
        
        return result;
    }
}
