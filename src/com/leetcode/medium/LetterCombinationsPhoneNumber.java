package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode #17
public class LetterCombinationsPhoneNumber {
	Map<String, String> phone = new HashMap<String, String>() {{
		put("2", "abc");
		put("3", "def");
		put("4", "ghi");
		put("5", "jkl");
		put("6", "mno");
		put("7", "pqrs");
		put("8", "tuv");
		put("9", "wxyz");
	}};

	List<String> output = new ArrayList<String>();

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0) {
			backtrack("", digits);
		}

		return output;
	}

	private void backtrack(String string, String nextDigits) {
		if (nextDigits.length() == 0) {
			output.add(string);
		} else {
			String digit = phone.get(nextDigits.substring(0, 1));
			
			for (int i = 0; i < digit.length(); i++) {
				String letter = digit.substring(i, i + 1);
				
				backtrack(string + letter, nextDigits.substring(1));
			}
		}
	}
	
	public static void main(String[] args) {
		LetterCombinationsPhoneNumber letter = new LetterCombinationsPhoneNumber();
		System.out.println(letter.letterCombinations("23"));		
	}

}
