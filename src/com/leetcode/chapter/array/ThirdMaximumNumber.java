package com.leetcode.chapter.array;

//leetcode #414
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		ThirdMaximumNumber max = new ThirdMaximumNumber();
		int[] arr = {2,2,3,1};
		System.out.println(max.thirdMax(arr));

	}
	
    public int thirdMax(int[] nums) {
        Integer thirdMax = null;
        Integer firstMax = null;
        Integer secondMax = null;      
        
        for (Integer n : nums) {
        	if (n.equals(firstMax) || n.equals(secondMax) || n.equals(thirdMax)) {
        		continue;
        	}
			if (firstMax == null || n > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = n;				
			} else if (secondMax == null || (n > secondMax && n < firstMax)) {
				thirdMax = secondMax;
				secondMax = n;
			} else if (thirdMax == null || (n > thirdMax && n < secondMax)){
				thirdMax = n;
			}
		}
               
        return thirdMax == null ? firstMax : thirdMax;
    }

}
