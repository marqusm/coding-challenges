package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void test01() {
        LongestConsecutiveSequence instance = new LongestConsecutiveSequence();
        Assertions.assertEquals(4, instance.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}