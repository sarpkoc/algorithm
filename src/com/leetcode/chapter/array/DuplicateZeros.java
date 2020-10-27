package com.leetcode.chapter.array;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] inputs = {1,0,2,3,0,4,5,0};
		DuplicateZeros duplicate = new DuplicateZeros();
		duplicate.duplicateZeros(inputs);
		System.out.println(inputs);
		
	}

	public void duplicateZeros(int[] arr) {
		int duplicatePossibleZeros = 0;
		int index = arr.length - 1;
		
		for (int i = 0; i < index - duplicatePossibleZeros; i++) {
			if (arr[i] == 0) {
				if (i == index - duplicatePossibleZeros) {
					arr[index--] = 0;
					break;
				}
			}
			
			duplicatePossibleZeros++;
		}
		
		int newLength = index - duplicatePossibleZeros;
		
		for (int k = newLength; k > -1; k--) {
			if (arr[k] == 0) {
				arr[index--] = arr[k];
			}
			arr[index--] = arr[k];
		}
    }
}
