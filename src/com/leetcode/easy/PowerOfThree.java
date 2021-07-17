package com.leetcode.easy;

//leetcode #326
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
