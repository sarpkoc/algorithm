package com.udemy.backtracking;

public class ColoringProblem {

	int[] colors;
	int numberOfColors;
	int[][] adjacencyMatrix;
	int numberOfVertexes;
	
	public static void main(String[] args) {
		int[][] example = new int[][] {
			{0, 1, 0, 1, 0},
			{1, 0, 1, 1, 0},
			{0, 1, 0, 1, 0},
			{1, 1, 1, 0, 1},
			{0, 0, 0, 1, 0}
		};
		
		int numColors = 2;
		
		ColoringProblem color = new ColoringProblem(example, numColors);
		color.solve();
	}
	
	public ColoringProblem(int[][] adjacencyMatrix, int numberOfColors) {
		this.numberOfColors = numberOfColors;
		this.adjacencyMatrix = adjacencyMatrix;
		this.numberOfVertexes = adjacencyMatrix.length;
		this.colors = new int[numberOfVertexes];
	}
	
	public void solve() {
		if (setColor(0)) {
			printResult(colors);
		} else {
			System.out.println("no solution");
		}
	}

	private boolean setColor(int vertex) {
		if (vertex == adjacencyMatrix.length) {
			return true;
		}
		
		for (int i = 1; i <= colors.length; i++) {
			
			if (validColor(vertex, i)) {
				colors[vertex] = i;
				
				if (setColor(vertex + 1)) {
					return true;
				}
				
				//BACKTRACKING		
			}			
		}
		
		return false;
	}

	private boolean validColor(int numberOfVertexes, int color) {
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[numberOfVertexes][i] == 1 && colors[i] == color) {
				return false;
			}
		}
		
		return true;
	}
	
	private void printResult(int[] colors) {
		for (int i = 0; i < colors.length; i++) {
			System.err.println("Node " + (i + 1) + "  has color index : " + colors[i]);
		}
	}
	
	
}
