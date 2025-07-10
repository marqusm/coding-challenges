package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CompareVersionNumbersTest {

    @Test
    void test01() {
        CompareVersionNumbers instance = new CompareVersionNumbers();
        Assertions.assertEquals(-1, instance.compareVersion("1.2", "1.10"));
    }

    @Test
    void test02() {
        CompareVersionNumbers instance = new CompareVersionNumbers();
        Assertions.assertEquals(0, instance.compareVersion("1.01", "1.001"));
    }

    @Test
    void test03() {
        CompareVersionNumbers instance = new CompareVersionNumbers();
        Assertions.assertEquals(0, instance.compareVersion("1.0", "1.0.0.0"));
    }

}
