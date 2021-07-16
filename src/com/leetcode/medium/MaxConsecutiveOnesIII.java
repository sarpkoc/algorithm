package com.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnesIII {
 
	public static void main(String[] args) {
		MaxConsecutiveOnesIII max = new MaxConsecutiveOnesIII();
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0,0,1,1,1};
		System.out.println(max.longestOnes(arr, 3));
		
		
	}
	
    public int longestOnes(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) K--;
            if (K < 0 && A[i++] == 0) K++;
        }
        return j - i;
    }

	//queue solution. it is slow.
    public int longestOnesQueue(int[] nums, int k) {
        int res = 0, cur = 0, cnt = 0, total = 0; 
        Queue<Integer> queue = new LinkedList<Integer>();	
        
        for (int i = 0; i < nums.length; i ++) {
            cnt ++;
            if (nums[i] == 0) {
                cur = cnt;
                cnt = 0;
                
                queue.add(cur);
                if (queue.size() > k) {
                	total = total + cur - queue.poll();
                } else {
                	total = total + cur;
                }
            } 
            
            res = Math.max(res, cnt + total);
        }
        return res;
    }
}
