package com.leetcode.contest.week213;

public class KthSmallestInstructions {
	
	public static void main(String[] args) {
		KthSmallestInstructions smallest = new KthSmallestInstructions();
		int[] destination = {2, 3};
		int k = 2;
		
		System.out.println(smallest.kthSmallestPath(destination, k));

	}
	
    public String kthSmallestPath(int[] destination, int k) {
        
    	int numberOfV = destination[0];
    	int numberOfH = destination[1];
    	
    	int size = numberOfV + numberOfH;

    	StringBuilder builder = new StringBuilder();
    	
    	for (int i = 0; i < size; i++) {
    		if (numberOfH == 0) {
    			builder.append('V');
    			continue;
    		} else if (numberOfV == 0){
    			builder.append('H');
    			continue;
    		}
    		
    		int tempK = factorialUsingForLoop(size - i- 1) 
    				/ (factorialUsingForLoop(numberOfV) * factorialUsingForLoop(numberOfH - 1));
			if (tempK < k) {
				builder.append('V');
				numberOfV--;
			} else {
				builder.append('H');
				numberOfH--;
			}
		}   	
    	
    	return builder.toString();
    }
    
    private int factorialUsingForLoop(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
