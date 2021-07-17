package com.leetcode.medium;

//leetcode #200
public class NumberOfIslands {
	public static void main(String[] args) {
		String s = "aaabbbabbbb";
		int[] cost = {3,5,10,7,5,3,5,5,4,8,1};
		NumberOfIslands minCost = new NumberOfIslands();
		System.out.println(minCost.minCost(s, cost));
	}

	public int minCost(String s, int[] cost) {
		int sumCost = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				if (cost[i] < cost[i - 1]) {
					sumCost += cost[i];
					int temp = cost[i - 1];
					cost[i - 1] = cost[i];
					cost[i] = temp;
				} else {
					sumCost += cost[i - 1];
				}
			}
		}
		return sumCost;
	}
}
