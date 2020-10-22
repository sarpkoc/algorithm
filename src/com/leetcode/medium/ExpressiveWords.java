package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//leetcode #809
public class ExpressiveWords {
	public static void main(String[] args) {
		ExpressiveWords expressiveWords = new ExpressiveWords();

		String s = "heeellooo";
		String[] words = {"hello", "hi", "helo"};
		System.out.println(expressiveWords.expressiveWords(s, words));
		ExpressiveWord word = new ExpressiveWord("heeellooo");
		System.out.println(word.key);
		System.out.println(word.counts);
	}

	public int expressiveWords(String s, String[] words) {
		int result = 0;
		ExpressiveWord mainWord = new ExpressiveWord(s);
		for (String string : words) {
			ExpressiveWord word = new ExpressiveWord(string);
			if (mainWord.counts.size() == word.counts.size()) {
				for (int i = 0; i < word.counts.size(); i++) {
					if (word.counts.get(i) == mainWord.counts.get(i) 
							|| (word.counts.get(i) >= 3 && mainWord.counts.get(i) >= 3 )) {
						if (word.key.equals(mainWord.key)) {
							result++;
						}
					}
				}
			}			
		}
		
		return result;
	}
}

class ExpressiveWord{
	String key;
	List<Integer> counts = new ArrayList<Integer>();
	
	public ExpressiveWord(String word) {
		StringBuilder builder = new StringBuilder();
		char lastChar = word.charAt(0);
		int count = 1;
		for (int i = 1; i < word.length(); i++) {
			char tempChar = word.charAt(i);
			if (tempChar == lastChar) {								
				count++;
				if (i == word.length()-1) {
					counts.add(count);
					builder.append(lastChar);
				}
			} else {
				counts.add(count);
				builder.append(lastChar);
				count = 1;
			}
			lastChar = tempChar;
		}
		
		key = builder.toString();
	}
}
