package com.leetcode.hard;

//leetcode #639
public class DecodeWaysII {
	public static void main(String[] args) {
		String s = "11106";
		DecodeWaysII decodeWays = new DecodeWaysII();
		
		System.out.println(decodeWays.numDecodings(s));		
	}
	
	
    public int numDecodings(String s) {
    	if(s == null || s.length() == 0) return 0;
    	
    	int len = s.length();
    	int[] dp = new int[len+1];
    	
    	dp[0] = 1;
    	if (s.charAt(0) == '0') dp[1] = 0;
    	else if (s.charAt(0) == '*') dp[1] = 9;
    	else dp[1] = 1;
    	
    	for (int i = 2; i <= len; i++) {
    		
			int second = Integer.valueOf(s.substring(i-2, i));
			
			if (s.charAt(i-1) == '*' || Integer.valueOf(s.substring(i-1, i))>0) {
				dp[i] += dp[i-1];
			}
			
			if (s.charAt(i-1) == '*' && s.charAt(i-2) == '*') {
				dp[i] += dp[i-2];
			} else if (s.charAt(i-1) == '*' 
					&& (Integer.valueOf(s.substring(i-2, i))>= 10 &&
						Integer.valueOf(s.substring(i-2, i))<= 26)) {
				dp[i] += dp[i-2];
			}
			if (second >= 10 && second <= 26) {
				dp[i] += dp[i-2];
			}
		}
    	
        return dp[len];
    }
}
