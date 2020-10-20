package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//leetcode #3
public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbba"));
		System.out.println(lengthOfLongestSubstringOptimized("abba"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		
		Set<Character> set = new HashSet<Character>();
		int ans = 0, i = 0, j = 0;
		
		while( i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		
		return ans;
	}
	
	public static int lengthOfLongestSubstringOptimized(String s) {
		int n = s.length();
		int ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0, j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j+1);
		}
		
		return ans;
	}

}
