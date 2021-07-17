package com.leetcode.medium;

//leetcode #200
public class NumberOfIslands {
	public static void main(String[] args) {
		char[][] inputs = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'}
			,{'0','0','0','0','0'},{'0','0','0','0','0'}};

		NumberOfIslands num = new NumberOfIslands();
		System.out.println(num.numIslands(inputs));

	}

	public int numIslands(char[][] grid) {
		int count = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column<grid[row].length; column++) {
				if (grid[row][column] == '1'){
					count++;
					dfs(grid, row, column);
				}
			}
		}

		return count;
	}

	private void dfs(char[][] grid, int row, int column){
		if(row<0 || column <0 || row>=grid.length || column>=grid[row].length){
			return;
		}
		if (grid[row][column] == '0'){
			return;
		}
		grid[row][column] = '0';
		dfs(grid, row + 1, column);
		dfs(grid, row - 1, column);
		dfs(grid, row, column + 1);
		dfs(grid, row, column - 1);
	}
}
