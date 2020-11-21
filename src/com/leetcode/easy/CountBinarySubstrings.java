package com.leetcode.easy;

//leetcode #696
public class CountBinarySubstrings {
	public static void main(String[] args) {
		String ex = "00110011";
		
		CountBinarySubstrings count = new CountBinarySubstrings();
		System.out.println(count.countBinarySubstrings(ex));
	}

	public int countBinarySubstrings(String s) {
		int size = s.length();
		if (size == 1) return 0;
		
		int total = 0;
		int previousCounter = 0;
		int counter = 1;
		
		for (int i = 1; i < size; i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				total += Math.min(previousCounter, counter);
				previousCounter = counter;
				counter = 1;
			} else {
				counter++;
			}
		}
		
		return total + Math.min(previousCounter, counter);
	}
}
