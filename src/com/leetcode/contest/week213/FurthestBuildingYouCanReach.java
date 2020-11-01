package com.leetcode.contest.week213;

import java.util.PriorityQueue;

//leetcode #1642
public class FurthestBuildingYouCanReach {

	public static void main(String[] args) {
		
		int[] heights = {1, 2, 3, 4};
		int bricks = 1;
		int ladders = 1;
		FurthestBuildingYouCanReach furthest = new FurthestBuildingYouCanReach();
		
		System.out.println(furthest.furthestBuilding(heights,bricks,ladders));
	}
	
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    	
    	int size = heights.length;
    	if (size == 1) return 0;
    	
    	int unUsedBricks = bricks;
    	for (int i = 1; i < size; i++) {
			if (heights[i - 1] < heights[i]) {
				int differenceOfBuildings = heights[i] - heights[i - 1];
				if (ladders > 0) {
					queue.add(differenceOfBuildings);
					if (queue.size() > ladders) {
						int temp = queue.poll();
						if (unUsedBricks >= temp) {
							unUsedBricks = unUsedBricks - temp;
						} else {
							return i - 1;
						}
					} 
				} else if (unUsedBricks >= differenceOfBuildings) {
					unUsedBricks = unUsedBricks - differenceOfBuildings;
				} else {
					return i - 1;
				}
			}
		}
    	
    	
        return size - 1;
    }
}
