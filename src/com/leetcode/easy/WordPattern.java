package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//leetcode #290
public class WordPattern {
    public static void main(String[] args) {
        WordPattern word = new WordPattern();
        System.out.println(word.wordPattern("aaaa", "dog dog dog dog"));

    }

    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        int length = pattern.length();
        int size = str.length;
        if (length != size) return false;

        Map index = new HashMap();
        for (Integer i=0; i<str.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(str[i], i))
                return false;

        return true;
    }
}

