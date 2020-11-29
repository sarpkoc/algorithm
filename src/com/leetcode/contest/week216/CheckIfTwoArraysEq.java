package com.leetcode.contest.week216;

//leetcode #1662
public class CheckIfTwoArraysEq {
	public static void main(String[] args) {
		CheckIfTwoArraysEq check = new CheckIfTwoArraysEq();
		String[] word1 = {"abc", "d", "defg"};
		String[] word2 = {"abcddefg"};
		System.out.println(check.arrayStringsAreEqual(word1, word2));
	}
	
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        
        for (int i = 0; i < word1.length; i++) {
        	w1.append(word1[i]);
		}
        
        for (int i = 0; i < word2.length; i++) {
        	w2.append(word2[i]);
		}
        
        if (w1.toString().equals(w2.toString())) {
        	return true;
        } else {
        	return false;
        }
    }
    //better solution O(N), space with O(1)
    public boolean arrayStringsAreEqualBetter(String[] word1, String[] word2) {
        int idx1 = 0, idx2 = 0, arrIdx1 = 0, arrIdx2 = 0;
        while (arrIdx1 < word1.length && arrIdx2 < word2.length) {
            if (word1[arrIdx1].charAt(idx1) != word2[arrIdx2].charAt(idx2)) return false;
            if (idx1 == word1[arrIdx1].length() - 1) {
                idx1 = 0;
                arrIdx1++;
            } else idx1++;
            if (idx2 == word2[arrIdx2].length() - 1) {
                idx2 = 0;
                arrIdx2++;
            } else idx2++;
        }
        return arrIdx1 == word1.length && arrIdx2 == word2.length;
    }
}
