package com.leetcode.easy;

//leetcode #191
public class NumberOfBitsSolution {

    public static void main(String[] args) {
        NumberOfBitsSolution number = new NumberOfBitsSolution();
        System.out.println(number.hammingWeight(31));
    }
    public int hammingWeight(int n) {
        int number = 0;

        while (n != 0){
            number++;
            n = n & (n-1);
        }

        return number;
    }
}
