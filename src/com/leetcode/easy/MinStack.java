package com.leetcode.easy;

import java.util.Stack;

//leetcode #155
public class MinStack {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); // return -3
		minStack.pop();
		minStack.top();    // return 0
		minStack.getMin();
	}

	Integer min = Integer.MAX_VALUE;
	Stack<Integer> stack;
	public MinStack() {
		stack = new Stack<Integer>();
	}

	public void push(int x) {
		if (x < min) {
			min = x;
		}   
		stack.push(x);
	}

	public void pop() {
		int minControl = stack.pop();

		if (minControl == min) {
			int temp = Integer.MAX_VALUE;
			for (int i = 0; i < stack.size(); i++) {
				temp = Math.min(temp, stack.get(i));
			}
			min = temp;
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}
