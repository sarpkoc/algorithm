package com.leetcode.easy;

//leetcode #168
public class ExcelSheetColumnName {
	public static void main(String[] args) {
		ExcelSheetColumnName excel = new ExcelSheetColumnName();
		System.out.println(excel.convertToTitle(27));
	}
	public String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;
			result.append((char)('A' + n % 26));
			n /= 26;
		}
		result.reverse();
		return result.toString();
	}
}
