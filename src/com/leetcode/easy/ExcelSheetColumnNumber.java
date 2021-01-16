package com.leetcode.easy;

//leetcode #171
public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		ExcelSheetColumnNumber excel = new ExcelSheetColumnNumber();
		System.out.println(excel.titleToNumber("ZY"));
	}

	public int titleToNumber(String s) {
		int size = s.length();
		int result = 0;

		for (int i = size - 1; i >= 0; i--) {
			result = result * 26 + s.charAt(size - i - 1) - 'A' + 1;
		}

		return result;
	}
}
