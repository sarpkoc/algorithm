package com.leetcode.hard;

public class TotalNQueensFirstFind {
	
	int queenNumber;
	int[][] chessBoard;
	
	public static void main(String[] args) {
		TotalNQueensFirstFind total = new TotalNQueensFirstFind(4);
		total.solve();
	}
	
	public TotalNQueensFirstFind(int queenNumber) {
		this.queenNumber = queenNumber;
		this.chessBoard = new int[queenNumber][queenNumber];
	}
	
    public int totalNQueens(int n) {
        return 0;
    }
    
    public void solve() {
    	
    	if (setQueens(0)) {
    		printSolution();
    	} else {
    		System.out.println("no solution");
    	}
    }

	private void printSolution() {
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				if (chessBoard[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println("");
		}		
	}

	private boolean setQueens(int columnIndex) {
		if (columnIndex == queenNumber) {
			return true;
		}
		
		for (int rowIndex = 0; rowIndex < chessBoard.length; rowIndex++) {
			if (validPosition(rowIndex, columnIndex)) {
				chessBoard[rowIndex][columnIndex] = 1;
				
				if (setQueens(columnIndex + 1)) {
					return true;
				}
				
				chessBoard[rowIndex][columnIndex] = 0;
			} else {
				chessBoard[rowIndex][columnIndex] = 0;
			}		
		}
		
		return false;
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
