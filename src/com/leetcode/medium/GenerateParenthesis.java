package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//leetcode #22
public class GenerateParenthesis {
    private int length;
    private List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        GenerateParenthesis parenthesis = new GenerateParenthesis();

        List<String> list = parenthesis.generateParenthesis(3);

        for (String item : list) {
            System.out.println(item);
        }
    }

    public List<String> generateParenthesis(int n) {
        length = n*2;
        generateString("",0, 0);

        return list;
    }

    private void generateString(String s, int openNumber, int closeNumber) {
        if (s.length() == length) {
            list.add(s);
            return;
        }

        if (openNumber > closeNumber) {
            generateString(s + ")",openNumber, closeNumber + 1);
        }

        if (openNumber < length / 2) {
            generateString(s+"(",openNumber+1, closeNumber);
        }
    }
}
