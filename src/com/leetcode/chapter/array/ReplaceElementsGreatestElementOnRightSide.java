package com.leetcode.chapter.array;

public class ReplaceElementsGreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] inputs = {17,18,5,4,6,1};
		ReplaceElementsGreatestElementOnRightSide replace = 
				new ReplaceElementsGreatestElementOnRightSide();
		replace.replaceElements(inputs);
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
	}

	public int[] replaceElements(int[] arr) {
		int size = arr.length;
		if (size == 0) return arr;
		int temp2 = 0;
		int temp = size - 1;
		for (int i = size - 2; i > -1; i--) {
			temp2 = arr[i];
			arr[i] = Math.max(arr[i + 1], temp);
			temp = temp2;
		}

		if (size > 1) arr[size - 2] = arr[size - 1];
		arr[size - 1] = -1;

		return arr;
	}

}
