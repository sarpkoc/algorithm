package com.leetcode.easy;

import java.util.HashMap;

//leetcode #5
public class IsomorphicStrings {
	public static void main(String[] args) {
		IsomorphicStrings str = new IsomorphicStrings();
		String s = "paper";
		String t = "title";
		System.out.println(str.isIsomorphic(s,t));
	}
	
    public boolean isIsomorphic(String s, String t) {
        boolean control = true;
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        
        for (int i = 0; i < s.length(); i++) {
        	char c1 = s.charAt(i);
        	char c2 = t.charAt(i);
			if (map.containsKey(c1) && map.get(c1) != c2 || (map.containsValue(c2) && !map.containsKey(c1))) {
				return false;
			} else {
				map.put(c1, c2);
			}
		}
        	
        return control;
    }
}
