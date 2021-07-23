package com.leetcode.medium;

//leetcode #915
public class PartitionArrayDisjointIntervals {

    public int partitionDisjoint(int[] nums) {
        int len = nums.length;
        int[] maxLeft = new int[len];
        int[] minRight = new int[len];

        int max = nums[0];
        for (int i = 0; i < len; i++) {
            max = Math.max(nums[i], max);
            maxLeft[i] = max;
        }

        int min = nums[len-1];
        for (int i = len-1; i >= 0; i--) {
            min = Math.min(nums[i], min);
            minRight[i] = min;
        }

        for (int i = 1; i < len; i++) {
            if(maxLeft[i-1]<=minRight[i]){
                return i;
            }
        }

        return 0;
    }
}
