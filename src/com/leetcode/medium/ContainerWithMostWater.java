package com.leetcode.medium;

//leetcode #11
public class ContainerWithMostWater {

	public static void main(String[] args) {
		ContainerWithMostWater container = new ContainerWithMostWater();
		int[] inputs = {1,8,6,2,5,4,8,3,7};
		System.out.println(container.maxArea(inputs));
	}

    public int maxArea(int[] height) {
        int result = 0;
        
        int i = 0;
        int j = height.length - 1;
        
        while (i < j) {
        	result = Math.max(result, (j - i) * Math.min(height[i], height[j]));
        	
        	
        	if (height[i] > height[j]) {
        		j--;
        	} else {
        		i++;
        	}
        }
    	
    	return result;
    }
}
