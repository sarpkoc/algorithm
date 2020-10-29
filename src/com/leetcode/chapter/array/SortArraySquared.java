package com.leetcode.chapter.array;

import java.util.Arrays;

//leetcode #977
public class SortArraySquared {

	public static void main(String[] args) {
		SortArraySquared sort = new SortArraySquared();
		int[] arr = {-7,-3,2,3,11};
		int[] arrNew = sort.sortedSquares(arr);
		
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
}
