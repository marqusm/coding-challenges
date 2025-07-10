package com.leetcode.problem;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(count, longest);
            }
        }

        return longest;
    }
}
