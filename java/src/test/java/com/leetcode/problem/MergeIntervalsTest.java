package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    @Test
    void test01() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        Assertions.assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    void test02() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        Assertions.assertArrayEquals(new int[][]{{1, 5}},
                mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}}));
    }

}
