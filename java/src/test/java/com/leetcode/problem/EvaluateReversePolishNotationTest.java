package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {

    @Test
    void test01() {
        EvaluateReversePolishNotation evalRPN = new EvaluateReversePolishNotation();
        Assertions.assertEquals(9,
                evalRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void test02() {
        EvaluateReversePolishNotation evalRPN = new EvaluateReversePolishNotation();
        Assertions.assertEquals(6,
                evalRPN.evalRPN(new String[]{"13", "5", "/", "4", "+"}));
    }

}
