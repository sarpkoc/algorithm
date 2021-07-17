package com.leetcode.easy;

//leetcode #268
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber missing = new MissingNumber();

        int[] nums = {1,2,3,0,5};
        System.out.println(missing.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int length = nums.length;

        int sum = 0;

        for (int i = 0; i < length ; i++) {
            sum += nums[i];
        }

        return ((length * (length + 1)) / 2 ) - sum;
    }
}
