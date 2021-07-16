package com.leetcode.easy;

//leetcode #231
public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo power = new PowerOfTwo();
        System.out.println(power.isPowerOfTwo(8));

    }

    public boolean isPowerOfTwo(int n) {
        if (n<0) return false;
        return Integer.bitCount(n)==1;
    }
}
