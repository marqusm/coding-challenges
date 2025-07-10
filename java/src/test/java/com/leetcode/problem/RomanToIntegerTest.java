package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    void test01() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void test02() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    void test03() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
    @Test
    void test04() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(621, romanToInteger.romanToInt("DCXXI"));
    }
}
