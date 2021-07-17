package com.leetcode.easy;

import java.util.Stack;

//leetcode #232
public class ImplementQueueUsingStacks {
    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        this.stack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> newStack = new Stack<Integer>();
        while(!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        newStack.push(x);

        while(!newStack.isEmpty()){
            stack.push(newStack.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
