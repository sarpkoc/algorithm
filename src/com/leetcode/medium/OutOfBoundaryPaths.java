package com.leetcode.medium;

import java.util.Arrays;

//leetcode #576
public class OutOfBoundaryPaths {
	int MODULO = 1000000007;

	public static void main(String[] args) {
		OutOfBoundaryPaths paths = new OutOfBoundaryPaths();

		int m = 2;
		int n = 2;

		int maxMove = 2;
		int startRow = 0;
		int startColumn = 0;

		System.out.println(paths.findPaths(m, n, maxMove, startRow, startColumn));
		System.out.println(paths.findPathsWithMemo(m, n, maxMove, startRow, startColumn));

	}


	public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
		if (startRow == m || startColumn == n || startRow < 0 || startColumn < 0) return 1;
		if (maxMove == 0) return 0;

		return findPaths(m, n, maxMove - 1, startRow - 1, startColumn)
				+ findPaths(m, n, maxMove - 1, startRow + 1, startColumn)
				+ findPaths(m, n, maxMove - 1, startRow, startColumn - 1)
				+ findPaths(m, n, maxMove - 1, startRow, startColumn + 1);
	}

	public int findPathsWithMemo(int m, int n, int maxMove, int startRow, int startColumn) {
		int[][][] memo = new int[m][n][maxMove+1];
		for (int[][] l : memo) for (int[] s1 : l) Arrays.fill(s1,  -1);

		return findPathsWithMemo(m, n, maxMove, startRow, startColumn, memo);
	}

	public int findPathsWithMemo(int m, int n, int maxMove, 
			int startRow, int startColumn, int[][][] memo) {
		if (startRow == m || startColumn == n || startRow < 0 || startColumn < 0) return 1;
		if (maxMove == 0) return 0;

		if (memo[startRow][startColumn][maxMove] >= 0) return memo[startRow][startColumn][maxMove];

		memo[startRow][startColumn][maxMove] = (
				(findPathsWithMemo(m, n, maxMove - 1, startRow - 1, startColumn, memo)
				+ findPathsWithMemo(m, n, maxMove - 1, startRow + 1, startColumn, memo)) % MODULO
				+ (findPathsWithMemo(m, n, maxMove - 1, startRow, startColumn - 1, memo) 
				+ findPathsWithMemo(m, n, maxMove - 1, startRow, startColumn + 1, memo)) % MODULO
                   ) % MODULO;


		return memo[startRow][startColumn][maxMove];
	}
}

