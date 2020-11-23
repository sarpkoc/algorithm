package com.udemy;

public class HamiltonianCycle {
	
	int numberOfVertices;
	int[] sequence;
	int[][] graph;
	
	public static void main(String[] args) {
//		int[][] sarp = {
//				{0, 1, 0},
//				{1, 0, 1},
//				{0, 1, 0}				
//		};
//		HamiltonianCycle hamilton = new HamiltonianCycle(sarp);
//		hamilton.solve();
//		
//		System.out.println(hamilton.hasSolution);
//		
		int[][] sarp2 = {
				{0, 1, 1, 1, 0, 0},
				{1, 0, 1, 0, 1, 0},
				{1, 1, 1, 1, 0, 1},
				{1, 0, 1, 0, 0, 1},
				{0, 1, 0, 0, 0, 1},
				{0, 1, 1, 1, 1, 1}
		};
		HamiltonianCycle hamilton2 = new HamiltonianCycle(sarp2);
		hamilton2.solve();
	}
	
	public HamiltonianCycle(int[][] graph) {
		this.graph = graph;
		this.numberOfVertices = graph.length;
		
		this.sequence = new int[numberOfVertices];
	}
	
	public void solve() {
		sequence[0] = 0;
		
		if (setHamiltonianSequence(1)) {
			for (int i = 0; i < sequence.length; i++) {
				System.out.print(sequence[i] + " ");
			}
			System.out.println(sequence[0]);
		} else {
			System.out.println("no solution");
		}

	}

	private boolean setHamiltonianSequence(int position) {
		
		if (position == numberOfVertices) {
			if (graph[sequence[position - 1]][sequence[0]] == 1) {				
				return true;
			} else {
				return false;
			}
		} 
		
		for (int j = 1; j < numberOfVertices; j++) {
			if (valid(j, position)) {
				sequence[position] = j;
				
				if (setHamiltonianSequence(position + 1)) {
					return true;
				} 
							
				//backtracking
			}
		}
		
		return false;
	}

	private boolean valid(int j, int position) {
		if (graph[sequence[position - 1]][j] == 0) {
			return false;
		}
		
		for (int i = 0; i < position; i++) {
			if (sequence[i] == j) {
				return false;
			}
		}
		
		return true;
	}

}
