package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @Test
    void test01() {
        SearchInRotatedSortedArray instance = new SearchInRotatedSortedArray();
        Assertions.assertEquals(4, instance.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void test02() {
        SearchInRotatedSortedArray instance = new SearchInRotatedSortedArray();
        Assertions.assertEquals(-1, instance.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void test03() {
        SearchInRotatedSortedArray instance = new SearchInRotatedSortedArray();
        Assertions.assertEquals(-1, instance.search(new int[]{1}, 0));
    }
}
