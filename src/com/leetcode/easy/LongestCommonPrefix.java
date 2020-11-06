package com.leetcode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix longest = new LongestCommonPrefix();
		String[] str = {"dog","racecar","car"};
		System.out.println(longest.longestCommonPrefix(str));

	}
	
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) return "";
        String prefix = strs[0];
    	int size = strs.length;
        
        for (int i = 1; i < size; i++) {
        	if (prefix.length() == 0) return ""; 
        	
        	if (strs[i].length() < prefix.length()) {
        		prefix = prefix.substring(0, strs[i].length());
        	}
        	
        	for (int j = 0; j < prefix.length(); j++) {
				if (strs[i].charAt(j) != prefix.charAt(j)) {
					prefix = prefix.substring(0, j);
					break;
				}
			}
		}
        
    	return prefix;
    }

}
