package com.leetcode.chapter.array;

import java.util.ArrayList;
import java.util.List;

//leetcode #1346
public class CheckIfExistInArray {

	public static void main(String[] args) {
		int[] inputs = {10,2,7,3};
		CheckIfExistInArray check = new CheckIfExistInArray();
		boolean result = check.checkIfExist(inputs);
		System.out.println(result);

	}
	
    public boolean checkIfExist(int[] arr) {
    	List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i]*2) || (arr[i] % 2 == 0 && list.contains(arr[i]/2)) ) {
				return true;
			} else {
				list.add(arr[i]);
			}
		}
        return false;
    }

}
