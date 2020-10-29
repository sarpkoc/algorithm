package com.leetcode.chapter.array;

//leetcode #905
public class SortArrayByParity {
	public static void main(String[] args) {
		SortArrayByParity sort = new SortArrayByParity();
		int[] arr = {3,1,2,4};
		sort.sortArrayByParity(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        int temp = 0;
        int size = A.length;
        for (int i = 0; i < size; i++) {
			if (A[i] % 2 == 0) {
				temp = A[index];
				A[index] = A[i];
				A[i] = temp;
				index++;
			}
		}
    	
    	return A;
    }
}
