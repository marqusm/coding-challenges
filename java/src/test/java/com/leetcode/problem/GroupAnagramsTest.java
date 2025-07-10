package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {

    @Test
    void test01() {
        GroupAnagrams instance = new GroupAnagrams();
        Assertions.assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")), instance.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}
