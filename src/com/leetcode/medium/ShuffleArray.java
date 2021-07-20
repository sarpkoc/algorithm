package com.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//leetcode #73
public class ShuffleArray {

    int[] initialArrray;
    int[] shuffledArrray;

    public ShuffleArray(int[] nums) {
        initialArrray = nums.clone();
        shuffledArrray = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return initialArrray;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = shuffledArrray.length;
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            int index = rand.nextInt(len);
            int temp = shuffledArrray[index];
            shuffledArrray[index] = shuffledArrray[i];
            shuffledArrray[i] = temp;
        }

        return shuffledArrray;
    }

    public static void main(String[] args) {
        int[] inputs= {1,2,3};
        ShuffleArray arr = new ShuffleArray(inputs);

        System.out.println(arr.initialArrray);
        System.out.println(arr.shuffle());
        System.out.println(arr.shuffle());
        System.out.println(arr.reset());
    }
}
