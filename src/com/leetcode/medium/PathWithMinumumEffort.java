package com.leetcode.medium;

//leetcode #1631
public class PathWithMinumumEffort {
    public static void main(String[] args) {
        PathWithMinumumEffort path = new PathWithMinumumEffort();
        int[][] inputs = {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        System.out.println(path.minimumEffortPath(inputs));
    }
    public int minimumEffortPath(int[][] heights) {
        return backTracking(heights,0,0);
    }

    public int backTracking(int[][] heights,int row, int height) {
        return Math.min(backTracking(heights, row + 1, height, Math.abs(heights[1][0] - heights[0][0]))
                , backTracking(heights, row, height + 1, Math.abs(heights[0][1] - heights[0][0])));
    }

    public int backTracking(int[][] heights,int row, int height, int maxDifference) {
        int result = Integer.MAX_VALUE;
        if (row + 1 >= heights.length && height + 1 >= heights[row].length ){
            return maxDifference;
        } else if (row + 1 < heights.length && height + 1 < heights[row].length){
            int rowRes = backTracking(heights, row + 1, height, Math.max(maxDifference, Math.abs(heights[row+1][height] - heights[row][height])));
            int heightRes = backTracking(heights, row , height + 1, Math.max(maxDifference, Math.abs(heights[row][height] - heights[row][height+1])));
            result = Math.min(rowRes,heightRes);
        } else if (row + 1 < heights.length){
            result = backTracking(heights, row + 1, height, Math.max(maxDifference, Math.abs(heights[row+1][height] - heights[row][height])));
        } else {
            result = backTracking(heights, row , height + 1, Math.max(maxDifference, Math.abs(heights[row][height] - heights[row][height+1])));
        }

        return Math.max(result, maxDifference);
    }
}
