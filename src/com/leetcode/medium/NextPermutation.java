package com.leetcode.medium;

import com.leetcode.util.ListNode;

//leetcode #31
public class NextPermutation {

    public static void main(String[] args) {
        NextPermutation next = new NextPermutation();
        int[] nums = {1,5,8,4,7,6,5,3,1};
        next.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void nextPermutation(int[] nums) {
        int size = nums.length - 1;
        int index = -1;
        for (int i = size; i >= 1; i--) {
            if (nums[i] > nums[i-1]){
                index = i - 1;
                break;
            }
        }
        if (index >= 0){
            int j = size;
            while (j >= 0){
                if (nums[j]>nums[index]){
                    swap(nums, index, j);
                    break;
                }
                j--;
            }
        }

        reverse(nums, index + 1);
    }

    public void reverse(int[] nums, int i) {
        int start = i;
        int end = nums.length - 1;

        while (start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
