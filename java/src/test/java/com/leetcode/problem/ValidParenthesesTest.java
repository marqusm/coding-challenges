package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    void test01() {
        ValidParentheses instance = new ValidParentheses();
        Assertions.assertEquals(true, instance.isValid("()"));
    }

}
