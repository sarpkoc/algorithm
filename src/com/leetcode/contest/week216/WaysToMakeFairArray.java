package com.leetcode.contest.week216;

//leetcode #1664
public class WaysToMakeFairArray {
	public static void main(String[] args) {
		WaysToMakeFairArray ways = new WaysToMakeFairArray();
		int[] inputs = {2,1,6,4};
		System.out.println(ways.waysToMakeFair(inputs));
		
	}
	
	
    public int waysToMakeFairTLE(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	int tempOdd = 0;
        	int tempEven = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j > i) {
					if (j % 2 == 0) {
						tempOdd += nums[j];
					} else {
						tempEven += nums[j];
					}
				} else if (j < i) {
					if (j % 2 == 0) {
						tempEven += nums[j];
					} else {
						tempOdd += nums[j];
					}
				}
			}
			if (tempEven == tempOdd) {
				count++;
			}
		}
              
        return count;
    }
    
    public int waysToMakeFair(int[] nums) {   
    	int count = 0;
    	
        int rightOdd = 0;
        int rightEven = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	if (i % 2 == 0) {
        		rightEven += nums[i];
			} else {
				rightOdd += nums[i];
			}
		}
        
        int leftEven = 0;
        int leftOdd = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	if (i % 2 == 0) {
        		rightEven -= nums[i];
        	} else {
        		rightOdd -= nums[i];
        	}

			if (rightEven + leftOdd == rightOdd + leftEven) {
				count++;
			}
			
        	if (i % 2 == 0) {
        		leftEven += nums[i];
        	} else {
        		leftOdd += nums[i];
        	}
		}
              
        return count;
    }
}
