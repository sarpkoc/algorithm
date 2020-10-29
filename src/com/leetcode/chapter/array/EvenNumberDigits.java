package com.leetcode.chapter.array;

//leetcode #1295
public class EvenNumberDigits {

	public static void main(String[] args) {
		EvenNumberDigits even = new EvenNumberDigits();
		int[] arr = {12,345,2,6,7896};
		int result = even.findNumbers(arr);
		
		System.out.println(result);

	}
	
    public int findNumbers(int[] nums) {
        int numberOfEven = 0;
    	
        for (int i = 0; i < nums.length; i++) {
        	int count = 0;
			while (nums[i] > 0) {
				nums[i] = nums[i] / 10;
				count++;
			}
			if (count % 2 == 0) {
				numberOfEven++;
			}			
		}
        
    	return numberOfEven;
    }
	

}
