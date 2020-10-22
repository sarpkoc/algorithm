package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

//leetcode #287
public class FindTheDuplicateNumber {

	public static void main(String[] args) {

		FindTheDuplicateNumber findNumber = new FindTheDuplicateNumber();
		int[] nums = {1,2,3,3,4};
		System.out.println(findNumber.findDuplicate(nums));

	}
	public int findDuplicate(int[] nums) {
		Set<Integer> ints = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (ints.contains(nums[i])){
				return nums[i];
			} else {
				ints.add(nums[i]);
			}			
		}
		return 0;
	}
}
