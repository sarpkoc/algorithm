package com.leetcode.medium;

//leetcode #1476
public class SubrectangleQueries {
	
	private int[][] subrectangle;

	public static void main(String[] args) {
		int[][] input = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
		SubrectangleQueries subrectangleQueries = new SubrectangleQueries(input); 
		System.out.println(subrectangleQueries.getValue(0,1));
	}
	
    public SubrectangleQueries(int[][] rectangle) {
    	subrectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
			for (int j = col1; j <= col2; j++) {
				subrectangle[i][j] = newValue;
			}
		}
    }
    
    public int getValue(int row, int col) {
        return subrectangle[row][col];
    }
}
