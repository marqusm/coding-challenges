package com.leetcode.problem;

import com.leetcode.problem.util.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    @Test
    void test01() {
        BalancedBinaryTree instance = new BalancedBinaryTree();
        Assertions.assertEquals(true, instance.isBalanced(Utils.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

    @Test
    void test02() {
        BalancedBinaryTree instance = new BalancedBinaryTree();
        Assertions.assertEquals(false, instance.isBalanced(Utils.buildTree(new Integer[]{1,2,2,3,3,null,null,4,4})));
    }

    @Test
    void test03() {
        BalancedBinaryTree instance = new BalancedBinaryTree();
        Assertions.assertEquals(false, instance.isBalanced(Utils.buildTree(new Integer[]{1, null, 2, null, 3})));
    }

}