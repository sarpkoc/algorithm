package com.leetcode.contest.week216;

//leetcode #1663
public class SmallestStringGivenNumericValue {
	public static void main(String[] args) {
		SmallestStringGivenNumericValue smallest = new SmallestStringGivenNumericValue();						
		System.out.println(smallest.getSmallestString(3, 27));
		
		System.out.println((char) (17 + 96));
	}
	
	
    public String getSmallestString(int n, int k) {
        StringBuilder result = new StringBuilder();
        int remaining = k - n + 1;
        
        for (int i = n; i >= 1; i--) {
			if (remaining >= 26) {
				result.insert(0, (char) 122);
				remaining = remaining - 26 + 1;
			} else {
				result.insert(0, (char) (remaining + 96));
				remaining = 1;
			}
		}
                     
        return result.toString();
    }
}
