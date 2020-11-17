package com.leetcode.easy;

//leetcode #38
public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay count = new CountAndSay();
		
		System.out.println(count.say("21"));
	}
	
    public String countAndSay(int n) {
        if (n == 1) return "1";
               
        return say(countAndSay(n-1));        
    }
    
    public String say(String str) {
    	if (str.length() == 1) return "11";
    	
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
    	}
    	
    	return builder.toString();
    }
}
