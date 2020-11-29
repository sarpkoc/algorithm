package com.leetcode.contest.week217;

//leetcode #1672
public class RichestCustomerWealth {

	
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int i = 0; i < accounts.length; i++) {
        	
        	int tempTotal = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				tempTotal += accounts[i][j];
			}
			
			max = Math.max(max, tempTotal);
		}
       
        return max;
    }
}
