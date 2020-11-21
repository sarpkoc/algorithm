package com.leetcode.easy;

//leetcode #28
public class ImplementStrStr {
	
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "k";
		
		ImplementStrStr str = new ImplementStrStr();
		
		System.out.println(str.strStr(haystack, needle));
	}
	
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
        	return 0;
        }
        
        int result = -1;
        int sizeNeedle = needle.length();
        int sizeHaystack = haystack.length();
        
        for (int i = 0; i < sizeHaystack - sizeNeedle + 1; i++) {
			for (int j = 0; j < sizeNeedle; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
				if (j == sizeNeedle - 1) {
					return i;
				}
			}
		}
        
        return result;        
    }
}
