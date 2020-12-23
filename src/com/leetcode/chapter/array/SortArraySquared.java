package com.leetcode.chapter.array;

import java.util.Arrays;

//leetcode #977
public class SortArraySquared {

	public static void main(String[] args) {
		SortArraySquared sort = new SortArraySquared();
		int[] arr = {-7, -5, -3,-1};
		int[] arrNew = sort.sortedSquaresBetter(arr);
		
		for (int i = 0; i < arrNew.length; i++) {
			System.out.println(arrNew[i]);
		}
	}

	public int[] sortedSquares(int[] A) {

		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		Arrays.sort(A);
		
		return A;
	}
	
    public int[] sortedSquaresBetter(int[] nums) {
        int[] result = new int[nums.length];
		int i = 0;
		int j = nums.length - 1;
				
		int lastIndex = nums.length - 1;
		while (i <= j) {
			int tempMin = nums[i];
			if (tempMin >= 0) {
				while (0 < lastIndex + 1) {
					result[lastIndex--] = nums[j] * nums[j];
					j--;
				}
			} else {
				int tempMinS = nums[i] * nums[i];
				int tempMaxS = nums[j] * nums[j];
				if (tempMinS >= tempMaxS) {
					result[lastIndex--] = tempMinS;
					i++;
				} else {
					result[lastIndex--] = tempMaxS;
					j--;
				}
			}
		}
		
		return result;
    }
}
