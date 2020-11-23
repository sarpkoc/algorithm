package com.udemy;

//leetcode #52
public class TotalNQueens {

	int queenNumber;
	int[][] chessBoard;

	int totalDistinct = 0;

	public static void main(String[] args) {
		TotalNQueens total = new TotalNQueens();
		total.totalNQueens(4);

		System.out.println(total.totalDistinct);
	}

	public int totalNQueens(int n) {
		this.queenNumber = n;
		this.chessBoard = new int[n][n];
		setQueens(0);   	
		return totalDistinct;
	}

	private void setQueens(int columnIndex) {
		for (int rowIndex = 0; rowIndex < chessBoard.length; rowIndex++) {
			if (validPosition(rowIndex, columnIndex)) {
				chessBoard[rowIndex][columnIndex] = 1;

				if (columnIndex + 1 == chessBoard.length) {
					totalDistinct++ ;
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
