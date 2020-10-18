package com.leetcode.medium;

//leetcode #413
public class ArithmeticSlices {

	public static void main(String[] args) {
		ArithmeticSlices arithmeticSlices = new ArithmeticSlices();
		
		int[] inputNumbers = {1, 2, 3, 4};
		System.out.println(arithmeticSlices.numberOfArithmeticSlices(inputNumbers));

	}

	public int numberOfArithmeticSlices(int[] A) {
		int sum = 0;
		
		int controlNumber = 0;
		
		for (int i = 2; i < A.length; i++) {
			if ( (A[i - 1] - A[i - 2]) == (A[i] - A[i - 1])) {
				controlNumber += 1;
				sum += controlNumber;
			} else {
				controlNumber = 0;
			}
		}
		
		return sum;
	}
}
