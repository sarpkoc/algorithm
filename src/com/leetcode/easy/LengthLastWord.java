package com.leetcode.easy;

//leetcode #53
public class LengthLastWord {
	public static void main(String[] args) {
		LengthLastWord word = new LengthLastWord();
		System.out.println(word.lengthOfLastWord("asd"));
	}
	
    public int lengthOfLastWord(String s) {
        int length = s.length();
        
        int lastWordLength = 0;
        
        for (int i = length - 1; i > -1; i--) {
			if (s.charAt(i) != ' ') {
				lastWordLength++;
			}
			
			if (s.charAt(i) == ' ' && lastWordLength > 0) {
				break;
			}
		}
        
        return lastWordLength;
    }	
}
