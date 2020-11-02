package com.leetcode.contest.week212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode #1630
public class ArithmeticSubarrays {

	public static void main(String[] args) {
		ArithmeticSubarrays sub = new ArithmeticSubarrays();
		int[] input1 = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		int[] intput2 = {0,1,6,4,8,7};
		int[] intput3 = {4,4,9,7,9,10};
		
		System.out.println(sub.checkArithmeticSubarrays(input1, intput2, intput3));

	}

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<Boolean>();
    	
    	int size = l.length;    	
    	
    	for (int i = 0; i < size; i++) {
    		int prevIndex = l[i];
    		int nextIndex = r[i];
    		
    		int[] temp = new int[nextIndex - prevIndex + 1];
    		int tempIndex = 0;
			for (int j = prevIndex; j <= nextIndex; j++) {
				temp[tempIndex++] = nums[j];
			}
			
			boolean isArithmetic = checkIfArithmetic(result, temp);
			result.add(isArithmetic);
		}
    	
    	return result;
    }

	private boolean checkIfArithmetic(List<Boolean> result, int[] temp) {
		if (temp.length < 2) return false;
		
		Arrays.sort(temp);		
		int diff = temp[1] - temp[0];
		
		for (int j = 2; j < temp.length; j++) {
			if (temp[j] - temp[j - 1] != diff) {
				return false;
			}
		}
		
		return true;
	}
}
