package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

//leetcode #51
public class TotalNQueensString {
	int queenNumber;
	int[][] chessBoard;
	
	List<List<String>> list = new ArrayList<List<String>>();

	public static void main(String[] args) {
		TotalNQueensString total = new TotalNQueensString();
		total.solveNQueens(4);

		System.out.println(total.list);
	}

	public List<List<String>> solveNQueens(int n) {
		this.queenNumber = n;
		this.chessBoard = new int[n][n];
		setQueens(0);   	
		return list;
	}
	
	private void addToList() {	
		List<String> queenList = new ArrayList<String>();
		for (int i = 0; i < chessBoard.length; i++) {
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < chessBoard.length; j++) {
				if (chessBoard[i][j] == 1) {
					builder.append("Q");
				} else {
					builder.append(".");
				}
			}
			queenList.add(builder.toString());
		}		
		list.add(queenList);
	}

	private void setQueens(int columnIndex) {
		for (int rowIndex = 0; rowIndex < chessBoard.length; rowIndex++) {
			if (validPosition(rowIndex, columnIndex)) {
				chessBoard[rowIndex][columnIndex] = 1;

				if (columnIndex + 1 == chessBoard.length) {
					addToList() ;
				} else {
					setQueens(columnIndex + 1);
				}

				chessBoard[rowIndex][columnIndex] = 0;
			} else {
				chessBoard[rowIndex][columnIndex] = 0;
			}		
		}
	}

	private boolean validPosition(int row, int column) {
		for (int i = 0; i < column; i++) {
			if (chessBoard[row][i] == 1) {
				return false;
			}
		}

		for (int i = 0; i < row; i++) {
			if (chessBoard[i][column] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (chessBoard[i][j] == 1) {
				return false;
			}
		}

		for (int i = row + 1, j = column - 1; i < chessBoard.length && j >= 0; i++, j--) {
			if (chessBoard[i][j] == 1) {
				return false;
			}
		}

		return true;
	}
}
