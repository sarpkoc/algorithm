package com.leetcode.easy;

//leetcode #70
public class ClimbingStairs {

	public static void main(String[] args) {
		
		ClimbingStairs stairs = new ClimbingStairs();
		
		System.out.println(stairs.climbStairs(2));
		
	}
	
    public int climbStairs(int n) {
    	   	
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
        
        
        return dp[n];
    }
}
