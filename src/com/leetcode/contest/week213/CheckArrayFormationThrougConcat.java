package com.leetcode.contest.week213;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode #1640
public class CheckArrayFormationThrougConcat {

	public static void main(String[] args) {
		CheckArrayFormationThrougConcat can = 
				new CheckArrayFormationThrougConcat();
		int[] arr1 = {91,4,64,78};
		int[][] arr2 = {{78},{ 4, 64},{91}};
		
		System.out.println(can.canFormArray(arr1, arr2));

	}
	
    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean result = true;
        Map<Integer, SubArray> map = new HashMap<Integer, SubArray>();
        for (int i = 0; i < pieces.length; i++) {
        	SubArray subArray = new SubArray();
        	subArray.array = pieces[i];
        	subArray.size = pieces[i].length;
        	map.put(pieces[i][0], subArray);  	
		}
        
        int i = 0;
        while (i < arr.length) {
			if (map.containsKey(arr[i])) {
				SubArray subArray = map.get(arr[i]);
				int size = subArray.size;	
				
				int[] temp = new int[size];
				for (int j = 0; j < size; j++) {
					if (i == arr.length) {
						return false;
					}
					temp[j] = arr[i++];
				}
				if (!Arrays.equals(temp, subArray.array)) {
					return false;
				}
								
			} else {
				return false;
			}
		}
        
    	
    	return result;
    }
	
	class SubArray {
		private int size;
		private int[] array;
	}
}
