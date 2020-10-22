package com.leetcode.chapter.recursion;

//leetcode #344 easy
public class ReverseString {
	
	public static void main(String[] args) {
		char[] sarp = {'s','a','r','p'};
		ReverseString reverse = new ReverseString(); 
		reverse.reverseString(sarp);
		System.out.println(sarp);
	}
	
    public void reverseString(char[] s) {
        int i = 0; 
        int j = s.length - 1;
        
        while (i < j) {
        	char temp = s[i];
        	s[i] = s[j];
        	s[j] = temp;
        	i++;
        	j--;
        }
    }

}
