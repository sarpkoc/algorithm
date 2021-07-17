package com.leetcode.medium;

import java.util.Arrays;

//leetcode #1679
public class MaxNumberKSumPairs {

    public static void main(String[] args) {
        MaxNumberKSumPairs max = new MaxNumberKSumPairs();
        int[] nums = {3,1,3,4,3};
        System.out.println(max.maxOperations(nums, 6));
    }

    public int maxOperations(int[] nums, int k) {
        int counter = 0;

        Arrays.sort(nums);

        int begin = 0;
        int end = nums.length - 1;

        while (begin < end){
            if (nums[begin] + nums[end] == k){
                counter++;
                begin++;
                end--;
            } else if (nums[begin] + nums[end] > k){
                end--;
            } else {
                begin++;
            }
        }

        return counter;
    }
}
