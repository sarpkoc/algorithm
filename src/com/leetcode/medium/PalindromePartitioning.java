package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	List<List<String>> list = new ArrayList<List<String>>();
	List<String> currList = new ArrayList<String>();
	
    public List<List<String>> partition(String s) {
    	backTrack(s); 
		return list;      
    }
    
    public void backTrack(String s) {
    	if (s.length() == 0) {
    		List<String> clone = new ArrayList<String>(currList);
    		list.add(clone);
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		String temp = s.substring(0, i + 1);
			if (isPalindrome(temp)) {
				currList.add(temp);
				backTrack(s.substring(i + 1));
				currList.remove(currList.size() - 1);
			}
		}
    }
    
	public boolean isPalindrome(String str) {
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
		PalindromePartitioning pal = new PalindromePartitioning();
		
		System.out.println(pal.partition("aab"));
	}
}
