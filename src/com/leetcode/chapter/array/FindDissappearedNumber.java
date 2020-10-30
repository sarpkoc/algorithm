package com.leetcode.chapter.array;

import java.util.ArrayList;
import java.util.List;

//leetcode #448
public class FindDissappearedNumber {

	public static void main(String[] args) {
		FindDissappearedNumber findDissappear = new FindDissappearedNumber();
		int[] inputs = {4,3,2,7,8,2,3,1};
		
		System.out.println(findDissappear.findDisappearedNumbers(inputs));
				

	}

    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> dissappearNumberList = new ArrayList<Integer>();
    	
    	for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -1 * nums[index];
			}
		}
    	
    	for (int k = 0; k < nums.length; k++) {
			if (nums[k] > 0) {
				dissappearNumberList.add(k+1);
			}
		}
    	
    	return dissappearNumberList;
    }
}
