package com.leetcode.easy;

//leetcode #1047
public class RemoveAllAdjacentDuplicatesFromString {
	
	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesFromString remove = 
				new RemoveAllAdjacentDuplicatesFromString();

		String str = "abbaca";
		System.out.println(remove.removeDuplicates(str));

	}
	
    public String removeDuplicates(String s) {
        
    	StringBuilder st = new StringBuilder();  	
  	
    	for (char ch: s.toCharArray()) {
    		if (st.length() > 0 && st.charAt(st.length() - 1) == ch ) {
    	    	st.deleteCharAt(st.length() - 1);
    		} else {
    			st.append(ch);
    		}
    	}
    	
    	return st.toString();
    }
}
