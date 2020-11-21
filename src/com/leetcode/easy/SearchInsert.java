package com.leetcode.easy;

//leetcode #35
public class SearchInsert {

	public static void main(String[] args) {
		SearchInsert insert = new SearchInsert();
		
		int[] nums = {1,3};
		int target = 2;
		System.out.println(insert.searchInsert(nums, target));
	}
	
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
        	int mid = (low + high) / 2;
        	
        	if (nums[mid] == target) return mid;
        	else if (nums[mid] < target) low = mid + 1; 
        	else high = mid - 1;        	
        }
        
        return low;
    }
}
