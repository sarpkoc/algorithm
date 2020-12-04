package com.leetcode.easy;

//leetcode #121
public class MaxProfit {
	public static void main(String[] args) {
		MaxProfit profit = new MaxProfit();
		
		int[] prices = {7,6,4,3,1};
		System.out.println(profit.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		int size = prices.length;
		if (size == 1 || size == 0) {
			return 0;
		}

		int profit = 0;

		int i = 0;
		int j = 1;
		while ( j < size) {
			if (prices[j] < prices[i]) {
				i = j;
				j++;
			} else if (prices[i] < prices[j]) {
				profit = Math.max(profit, prices[j] - prices[i]);
				j++;
			} else {
				j++;
			}     	
		}

		return profit;
	}	
}
