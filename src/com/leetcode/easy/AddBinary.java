package com.leetcode.easy;

//leetcode #67
public class AddBinary {
	public static void main(String[] args) {
		AddBinary add = new AddBinary();
		
		System.out.println(add.addBinary("1010", "1011"));
	}
	
    public String addBinary(String a, String b) {
    	StringBuilder sb = new StringBuilder();
        int sizeA = a.length() - 1;
        int sizeB = b.length() - 1;
        
        int i = sizeA;
        int j = sizeB;
        
        int sum = 0;
        int carry = 0;
    	while ( i >= 0 || j >= 0) {
    		sum = carry;
    		
    		if (i >= 0) sum += a.charAt(i--) - '0';
    		if (j >= 0) sum += b.charAt(j--) - '0';
    		sb.insert(0, sum % 2);
    		carry = sum / 2;    		
    	}
    	
    	if (carry > 0) sb.insert(0, carry); 
    	
    	return sb.toString();
    }
}
