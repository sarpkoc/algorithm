package com.leetcode.easy;

import com.leetcode.medium.LongestPalindrome;

public class AddDigits {
    public static void main(String[] args) {
        AddDigits add = new AddDigits();
        System.out.println(add.addDigits(38));
    }

    public int addDigits(int num) {
        while (num / 10 > 0){
            int temp = num;
            num = 0;
            while (temp > 0){
                num += temp % 10;
                temp = temp / 10;
            }
        }

        return num;
    }
}
