package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeSubstringTest {

    @Test
    void test01() {
        LongestPalindromicSubstring instance = new LongestPalindromicSubstring();
        Assertions.assertEquals("bab", instance.longestPalindrome("babad"));
    }

    @Test
    void test02() {
        LongestPalindromicSubstring instance = new LongestPalindromicSubstring();
        Assertions.assertEquals("bb", instance.longestPalindrome("cbbd"));
    }
}
