package com.leetcode.medium;

//leetcode #74
public class Search2dMatrix {
	public static void main(String[] args) {
		int[][] inputs= {{1,3,5}};
		Search2dMatrix matrix = new Search2dMatrix();
		System.out.println(matrix.searchMatrix(inputs, 3));
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int rowNum = matrix.length;
		int columnNum = matrix[0].length;
		for (int row = 0; row < rowNum; row++) {
			if (matrix[row][columnNum-1] == target){
				return true;
			} else if (matrix[row][columnNum-1] > target) {
				return binarySearch(matrix[row], 0, columnNum-2, target);
			}
		}

		return false;
	}

	private boolean binarySearch(int[] matrix, int left,int right, int target) {
		while (left<=right){
			int middle = left + ((right-left)/2);
			if(matrix[middle] == target) return true;

			if(matrix[middle] < target) left++;

			if(matrix[middle] > target) right--;
		}

		return false;
	}
}
