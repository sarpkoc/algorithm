package com.leetcode.medium;

//leetcode #73
public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] inputs = {{1,1,1},{1,0,1},{1,1,1}};

		SetMatrixZeroes matrix = new SetMatrixZeroes();
		matrix.setZeroes(inputs);

		int[][] inputs2= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		matrix.setZeroes(inputs2);
	}
	public void setZeroes(int[][] matrix) {
		int rowNum = matrix.length;
		int columnNum = matrix[0].length;
		boolean[][] bool = new boolean[rowNum][columnNum];

		for (int row = 0; row < rowNum; row++) {
			for (int column = 0; column < columnNum; column++) {
				if(!bool[row][column] && matrix[row][column] == 0){
					setZero(matrix, row, column, bool);
				}
			}
		}
	}

	private void setZero(int[][] matrix, int row, int column, boolean[][] bool) {
		int rowNum = matrix.length;
		int columnNum = matrix[0].length;
		for (int i = 0; i < rowNum; i++) {
			if(i != row && matrix[i][column] != 0){
				matrix[i][column] = 0;
				bool[i][column] = true;
			}
		}

		for (int i = 0; i < columnNum; i++) {
			if(i != column && matrix[row][i] != 0){
				matrix[row][i] = 0;
				bool[row][i]  = true;
			}
		}
	}
}
