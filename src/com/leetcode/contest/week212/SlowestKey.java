package com.leetcode.contest.week212;

import java.util.Collections;
import java.util.PriorityQueue;

//leetcode #1629
public class SlowestKey {

	public static void main(String[] args) {
		int[] releaseTimes = {12,23,36,46,62};
		String keysPressed = "spuda";
		
		SlowestKey slowestKey = new SlowestKey();
		
		System.out.println(slowestKey.slowestKey(releaseTimes, keysPressed));

	}
	
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
    	PriorityQueue<Character> list = new PriorityQueue<Character>(Collections.reverseOrder());
    	int max = 0;
    	int previousTime = 0;
    	for (int i = 0; i < releaseTimes.length; i++) {
    		previousTime = i == 0 ? previousTime : releaseTimes[i - 1];
			int diff = releaseTimes[i] - previousTime;
			if (diff > max) {
				max = diff;
				list.clear();
				list.add(keysPressed.charAt(i));
			} else if (diff == max){
				list.add(keysPressed.charAt(i));
			}
		}
    	
    	return list.peek();
    }

}
