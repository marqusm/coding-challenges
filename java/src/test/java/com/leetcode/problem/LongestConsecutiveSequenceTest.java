package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Assertions.assertEquals(
                AddTwoNumbers.createListNode(new int[]{7, 0, 8}),
                addTwoNumbers.addTwoNumbers(
                        AddTwoNumbers.createListNode(new int[]{2, 4, 3}),
                        AddTwoNumbers.createListNode(new int[]{5, 6, 4})
                )
        );
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        Assertions.assertEquals(4, solution.longestConsecutive(new int[]{1, 1, 2, 2, 3, 3, 4}));
    }
}