package com.leetcode.easy;

import java.util.Arrays;

//leetcode #1437
public class CheckIfAll1sAreAtLeastLengthPlacesAway {

    public static void main(String[] args) {
        CheckIfAll1sAreAtLeastLengthPlacesAway away =
                new CheckIfAll1sAreAtLeastLengthPlacesAway();
        int[] nums = {1,0,0,1,0,1};
        System.out.println(away.kLengthApart(nums,2));
    }

    public boolean kLengthApart(int[] nums, int k) {
        boolean result = true;
        int size = nums.length;
        int previousIndex = -1;

        for (int i = 0; i < size ; i++) {
            if (previousIndex < 0 && nums[i] == 1){
                previousIndex = i;
            } else if (previousIndex >= 0 && nums[i] == 1){
                if (i - previousIndex - 1 < k){
                    result = false;
                    break;
                } else {
                    previousIndex = i;
                }
            }
        }

        return result;
    }
}
