package com.leetcode.problem;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        int maxLength = 0;
        for (int num : map) {
            if (!map.contains(num - 1)) {
                int length = 1;
                while (true) {
                    if (map.contains(num + 1)) {
                        length++;
                        num++;
                    } else {
                        maxLength = Math.max(maxLength, length);
                        break;
                    }
                }
            }
        }
        return maxLength;
    }
}
