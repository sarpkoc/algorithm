package com.leetcode.chapter.array;

//leetcode #941
public class MountainArray {

	public static void main(String[] args) {
		int[] input = {0,3,2,1};
		MountainArray mountainArray = new MountainArray();
		boolean check = mountainArray.validMountainArray(input);
		System.out.println(check);
	}
	
    public boolean validMountainArray(int[] A) {
    	int index = 0;
    	int arraySize = A.length;
    	if (arraySize < 3) return false;
    	
    	while (index < arraySize -2 && A[index] < A[index + 1]) {
    		index++;
    	}
    	if (index == 0) return false;
    	
    	while (index < arraySize -1 && A[index] > A[index + 1]) {
    		index++;
    	}
    	
    	if (index == arraySize -1) {
    		return true;
    	}
    	
		return false;        
    }
}
