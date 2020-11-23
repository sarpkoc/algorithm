package com.leetcode.easy;

//leetcode #38
public class CountAndSay {
	public static void main(String[] args) {
		CountAndSay count = new CountAndSay();
		System.out.println(count.countAndSay(4));
	}
	
    public String countAndSay(int n) { 	
    	String result = "1";
        for (int i = 2; i <= n; i++) {
        	result = say(result);
		}
        
		return result;       
    }
    
    public String say(String str) {
    	StringBuilder builder = new StringBuilder();
    	int counter = 1;
    	for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				builder.append(counter);
				builder.append(str.charAt(i));
				counter = 1;
			} else {
				counter++;
			}
		}
    	
    	if (counter != 1) {
    		builder.append(counter);
    		builder.append(str.charAt(str.length() - counter));
    	} else {
    		builder.append("1");
    		builder.append(str.charAt(str.length() - 1));
    	}
    	
    	return builder.toString();
    }
}
