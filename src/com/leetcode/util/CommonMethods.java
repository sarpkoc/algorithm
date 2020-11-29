package com.leetcode.util;

public class CommonMethods {

	public static boolean isPalindrome(String str) {
		int length = str.length();
		int i = 0;
		int j = length - 1;
		
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(CommonMethods.isPalindrome("bb"));
		System.out.println(CommonMethods.isPalindrome("adaa"));
	}
}
