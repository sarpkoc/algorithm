package com.leetcode.contest.week213;

//leetcode #1641
public class CountVovelStrings {
	
	public static void main(String[] args) {
		CountVovelStrings count = new CountVovelStrings();
		
		System.out.println(count.countVowelStrings(3));
	}

	public int countVowelStrings(int n) {
		int[] permutation = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = permutation.length - 1; j > -1; j--) {
				temp += permutation[j];
				permutation[j] = temp;
			}
		}
		
		return permutation[0];
	}
}
