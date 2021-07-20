package com.leetcode.medium;

//leetcode #74
public class SortColors {
	public static void main(String[] args) {
		int[] inputs= {0};
		SortColors sort = new SortColors();
		sort.sortColors(inputs);
	}

	public void sortColors(int[] nums) {
		int len = nums.length;
		int indexZero = 0;
		int indexTwo = len-1;
		int i = 0;

		while(i<=indexTwo){
			if(nums[i] == 2){
				int temp = nums[i];
				nums[i] = nums[indexTwo];
				nums[indexTwo--] = temp;
			}else if(nums[i] == 0){
				int temp = nums[i];
				nums[i++] = nums[indexZero];
				nums[indexZero++] = temp;
			}else if(nums[i] == 1) {
				i++;
			}
		}
	}
}
