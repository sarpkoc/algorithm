package com.leetcode.medium;

import java.util.Random;

//leetcode #215
public class KthLargestElement {
	
	public static void main(String[] args) {
		int[] nums = { 4, 3, 7, 10, 11};
		KthLargestElement largestElement = new KthLargestElement();
		
		System.out.println(largestElement.findKthLargest(nums, 2));
	}

    public int findKthLargest(int[] nums, int k) {   	
    	return select(nums, 0, nums.length - 1, k - 1);
    }
    
    private int select(int[] nums, int firstIndex, int lastIndex, int k) {
    	
    	int pivot = partition(nums, firstIndex, lastIndex);
    	
    	if (pivot > k) {
    		return select(nums, firstIndex, pivot - 1, k);
    	} else if (pivot < k) {
    		return select(nums, pivot + 1, lastIndex, k);
    	}
    	
    	return nums[k];
    }

	private int partition(int[] nums, int firstIndex, int lastIndex) {
		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
		
		swap(nums, lastIndex, pivot);
		
		for (int i = firstIndex; i < lastIndex; i++) {
			if (nums[i] > nums[lastIndex]) {
				swap(nums, i, firstIndex);
				firstIndex++;
			}
		}
		
		swap(nums, firstIndex, lastIndex);
		
		return firstIndex;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;		
	}
        
}
