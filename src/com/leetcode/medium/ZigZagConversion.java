package com.leetcode.medium;

//leetcode #6
public class ZigZagConversion {

	public static void main(String[] args) {
		ZigZagConversion zigzag = new ZigZagConversion();
		String input = "PAYPALISHIRING";
		
		System.out.println(zigzag.convert(input, 3));

	}
	
    public String convert(String s, int numRows) {
        int sSize = s.length();
        StringBuilder builder = new StringBuilder();
        
    	
        if (numRows == 1) return s;
        
        int cycleLen = (numRows * 2) - 2; 
                
        for (int i = 0; i < numRows; i++) {
        	for (int j = 0; j + i < sSize; j += cycleLen) {
        		builder.append(s.charAt(j+i));
        		
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < sSize) {
                	builder.append(s.charAt(j + cycleLen - i));
            	}
			}
		}

        
    	return builder.toString();
    }

}
