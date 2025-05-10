package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void test01() {
        LongestSubstringWithoutRepeatingCharacters o = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(3, o.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test02() {
        LongestSubstringWithoutRepeatingCharacters o = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(1, o.lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    void test03() {
        LongestSubstringWithoutRepeatingCharacters o = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(3, o.lengthOfLongestSubstring("pwwkew"));
    }
}