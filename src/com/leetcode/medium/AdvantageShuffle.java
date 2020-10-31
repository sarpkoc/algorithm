package com.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//leetcode #870
public class AdvantageShuffle {

	public static void main(String[] args) {
		int[] input1 = {12,24,8,32};
		int[] input2 = {13,25,32,11};

		AdvantageShuffle advantageShuffle = new AdvantageShuffle();
		int[] result = advantageShuffle.advantageCount(input1, input2);

		for (int i : result) {
			System.out.println(i);
		}
	}


	public int[] advantageCount(int[] A, int[] B) {
		//sort in order to compare two array
		int[] sortedA = A.clone();
		Arrays.sort(sortedA);
		int[] sortedB = B.clone();
		Arrays.sort(sortedB);

		//assign A to B 
		//if sortedA[i] is less than sortedB[i] than, it goes to remaining deque 
		Map<Integer, Deque<Integer>> assignedMap = new HashMap<Integer, Deque<Integer>>();
		Deque<Integer> remaining = new ArrayDeque<Integer>();

		for (Integer i : B) {
			assignedMap.put(i, new LinkedList<Integer>());
		}

		int j = 0;
		for (Integer a : sortedA) {
			if (a > sortedB[j]) {
				assignedMap.get(sortedB[j++]).add(a);				
			} else {
				remaining.add(a);
			}
		}

		//build the result object
		int[] result = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			if (assignedMap.get(B[i]).size() > 0) {
				result[i] = assignedMap.get(B[i]).pop();
			} else {
				result[i] = remaining.pop();
			}
		}
		
		return result;
	}
}
