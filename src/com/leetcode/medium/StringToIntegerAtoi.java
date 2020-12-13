package com.leetcode.medium;

//leetcode #8
public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        if (s.length() == 0) {
        	return 0;
        }
        int sign = 1;
        int res = 0;
        int index = 0;
        int size = s.length();
        
        while (index < size && s.charAt(index) == ' ') {
        	index++;
        }
        
        if (index < size && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
    		sign = s.charAt(index) == '-' ? -1 : 1;
    		index++;
    	}
        
        while (index < size && (s.charAt(index) >= '0' && s.charAt(index) <= '9')) {
        	
        	if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        	res = (10 * res) + Integer.valueOf(s.substring(index, index + 1));
        	
        	index++;
        }
 
        return res * sign;
    }
    
	
	public static void main(String[] args) {
		StringToIntegerAtoi str = new StringToIntegerAtoi();
		System.out.println(str.myAtoi("2147483648"));
	}
}
