package com.leetcode.chapter.array;

//leetcode #88
public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] input1 = {1,2,3,0,0,0};
		int[] input2 = {2,5,6};
		MergeTwoArrays merge = new MergeTwoArrays();
		merge.merge(input1, 3, input2, 3);
		System.out.println(input1);

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int sizeNums1 = m - 1;
		int sizeNums2 = n - 1;
		int size = nums1.length - 1;
		for (int i = 0; i <= size; i++) {
			if (sizeNums1 == -1) {
				nums1[size - i] = nums2[sizeNums2];
				sizeNums2--;
			} else if (sizeNums2 == -1) {
				nums1[size - i] = nums1[sizeNums1];
				sizeNums1--;
			} else if (nums1[sizeNums1] <= nums2[sizeNums2]) {
				nums1[size- i] = nums2[sizeNums2];
				sizeNums2--;
			} else {
				nums1[size - i] = nums1[sizeNums1];
				sizeNums1--;
			}
		}
	}

}
