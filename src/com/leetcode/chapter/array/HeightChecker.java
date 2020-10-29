package com.leetcode.chapter.array;

import java.util.Arrays;

//leetcode #1051
public class HeightChecker {

	public static void main(String[] args) {
		HeightChecker height = new HeightChecker();
		int[] arr = {1,1,4,2,1,3};
		System.out.println(height.heightChecker(arr));
	
	}

    public int heightChecker(int[] heights) {
        int difference = 0;
        
        int size = heights.length;
        int[] unsortedArray = Arrays.copyOf(heights, size);
        Arrays.sort(heights);
        for (int i = 0; i < size; i++) {
			if (unsortedArray[i] != heights[i]) {
				difference++;
			}
		}
        
        return difference;
    }
}
