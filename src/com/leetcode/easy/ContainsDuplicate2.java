package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//leetcode #218
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        ContainsDuplicate2 duplicate = new ContainsDuplicate2();
        int[] num = {1,2,3,1};
        System.out.println(duplicate.containsNearbyDuplicate(num, 3));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
