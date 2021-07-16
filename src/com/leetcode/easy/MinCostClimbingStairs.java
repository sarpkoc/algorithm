package com.leetcode.easy;

//leetcode #746
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		int[] cost2 = {10, 15, 20};
		
		MinCostClimbingStairs min = new MinCostClimbingStairs();
		int minCost = min.minCostClimbingStairs(cost);
		System.out.println(minCost);
		int minCost2 = min.minCostClimbingStairs(cost2);
		System.out.println(minCost2);
	}
	
    public int minCostClimbingStairs(int[] cost) {
        int minCost = 0;
        
        int index = 0;
        int len = cost.length;
        while (index < len - 1) {
        	if (cost[index] < cost[index+1]) {
        		minCost += cost[index++];        		
        	} else {
        		minCost += cost[++index]; 
        		index++;
        	}
        }
        
        return minCost;
    }
}
