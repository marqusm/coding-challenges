package com.leetcode.problem;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            System.out.println("Str: " + str);

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> entry = map.computeIfAbsent(key, o -> new ArrayList<>());
            entry.add(str);
        }

        return new ArrayList<>(map.values());
    }

}
