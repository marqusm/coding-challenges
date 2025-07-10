package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test01() {
        BinarySearch instance = new BinarySearch();
        Assertions.assertEquals(4, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void test02() {
        BinarySearch instance = new BinarySearch();
        Assertions.assertEquals(0, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, -1));
    }

    @Test
    void test03() {
        BinarySearch instance = new BinarySearch();
        Assertions.assertEquals(1, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
    }

    @Test
    void test04() {
        BinarySearch instance = new BinarySearch();
        Assertions.assertEquals(-1, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, 7));
    }

}