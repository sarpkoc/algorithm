package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

//leetcode #202
public class HappyNumber {
    public static void main(String[] args){
        HappyNumber happy = new HappyNumber();

        System.out.println(happy.isHappy(19));
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;
        boolean isHappy = false;
        while (result != 1){
            result = 0;
            while (n > 0){
                int num = n % 10;
                result += num * num;
                n = n / 10;
            }
            if (result == 1){
                isHappy = true;
            } else {
                if (set.contains(result)){
                    break;
                }
                set.add(result);
                n = result;
            }
        }

        return isHappy;
    }
}
