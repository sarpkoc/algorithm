package com.leetcode.easy;

//leetcode #53
public class PlusOne {
	public static void main(String[] args) {
		PlusOne plus = new PlusOne();
		
		int[] temp = {9,8,7,6,5,4,3,2,1,0};
		System.err.println(plus.plusOne(temp));
	}
	
	
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    	
    }
}
