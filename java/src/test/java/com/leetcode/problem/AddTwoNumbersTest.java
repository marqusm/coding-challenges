package com.leetcode.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    void test01() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Assertions.assertEquals(
                AddTwoNumbers.createListNode(new int[]{7, 0, 8}),
                addTwoNumbers.addTwoNumbers(
                        AddTwoNumbers.createListNode(new int[]{2, 4, 3}),
                        AddTwoNumbers.createListNode(new int[]{5, 6, 4})
                )
        );
    }

    @Test
    void test03() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Assertions.assertEquals(
                AddTwoNumbers.createListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1}),
                addTwoNumbers.addTwoNumbers(
                        AddTwoNumbers.createListNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
                        AddTwoNumbers.createListNode(new int[]{9, 9, 9, 9})
                )
        );
    }
}
