package com.leetcode.easy;

//leetcode #122
public class BestTimeBuySellStock {
	public static void main(String[] args) {
		BestTimeBuySellStock profit = new BestTimeBuySellStock();

		int[] prices = {7,6,4,3,1};
		System.out.println(profit.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		int size = prices.length;
		if (size == 1 || size == 0) {
			return 0;
		}

		int profit = 0;
		int maxProfit = 0;

		int i = 0;
		int j = 1;
		while ( j < size) {
			if (prices[j] < prices[j - 1]) {
				profit += maxProfit;
				maxProfit = 0;
				i = j;
				j++;
			} else if (prices[j - 1] < prices[j]) {
				maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
				j++;
			} else {
				j++;
			}     	
		}
		profit += maxProfit;

		return profit;
	}	

	public int maxProfitWithDpSolution(int[] A) {
		int n = A.length, lastBuy = -A[0], lastSold = 0;
		if (n == 0) return 0;

		for (int i = 1; i < n; i++) {
			int curBuy = Math.max(lastBuy, lastSold - A[i]);
			int curSold = Math.max(lastSold, lastBuy + A[i]);
			lastBuy = curBuy;
			lastSold = curSold;
		}

		return lastSold; 
	}
}
