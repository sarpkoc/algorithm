package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

//leetcode #217
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        System.out.println(duplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Set<Integer> sets = new HashSet<Integer>();

        for (int i = 0; i < size; i++) {
            if (sets.contains(nums[i])){
                return true;
            } else {
                sets.add(nums[i]);
            }
        }

        return false;
    }
}
