package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//leetcode #20
public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses validParentheses = new ValidParentheses();
		String str = "))";
		System.out.println(validParentheses.isValid(str));

	}
	
	
    public boolean isValid(String s) {
    	Map<Character, Character> brackets = new HashMap<Character, Character>();
    	brackets.put('(', ')');
    	brackets.put('{', '}');
    	brackets.put('[', ']');
    	
    	Stack<Character> stack = new Stack<Character>(); 
    	
    	int size = s.length();
    	if (size == 1) return false;

    	for (int i = 0; i < size; i++) {
			if (!brackets.containsKey(s.charAt(i))) {
				if (!stack.empty() 
						&& s.charAt(i) == brackets.get(stack.peek())) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(s.charAt(i));
			}
		}
    	
        return stack.isEmpty();
    }
}
