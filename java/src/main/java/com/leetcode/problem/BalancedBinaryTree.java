package com.leetcode.problem;

import com.leetcode.problem.util.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1; // Not balanced

        int right = checkHeight(node.right);
        if (right == -1) return -1; // Not balanced

        if (Math.abs(left - right) > 1) return -1; // Height difference too much

        return Math.max(left, right) + 1;
    }
}
