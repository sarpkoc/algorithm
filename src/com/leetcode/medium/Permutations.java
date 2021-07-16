package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//leetcode #46
public class Permutations {

	public static void main(String[] args) {
		Permutations perm = new Permutations();

		int[] nums = {1,2,3};
		
		System.out.println(perm.permute(nums));
	}
	
    public List<List<Integer>> permute(int[] nums) {
    	
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	
    	backtracking(list, new ArrayList<Integer>(), nums);
    	
		return list;       
    }

	private void backtracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<Integer>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i])) continue;
				
				tempList.add(nums[i]);
				
				backtracking(list, tempList, nums);
				
				tempList.remove(tempList.size() - 1);
			}
		}
		
	}
}
