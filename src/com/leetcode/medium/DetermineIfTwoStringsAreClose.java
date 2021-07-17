package com.leetcode.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//leetcode #1657
public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose strings = new DetermineIfTwoStringsAreClose();

        System.out.println(strings.closeStrings("cabbba", "abbccc"));
    }
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();

        int size = word1.length();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c,0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())){
            return false;
        }

        List<Integer> list1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = map1.values().stream().sorted().collect(Collectors.toList());

        return list1.equals(list2);
    }
}
