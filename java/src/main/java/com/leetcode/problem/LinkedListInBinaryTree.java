package com.leetcode.problem;

public class LinkedListInBinaryTree {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;

        // Check if current tree node starts a valid path
        if (dfsMatch(head, root)) return true;

        // Try recursively on left and right subtree
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean dfsMatch(ListNode head, TreeNode node) {
        if (head == null) return true;  // Fully matched linked list
        if (node == null) return false; // Tree ended but list not finished
        if (node.val != head.val) return false;

        // Try to match the next list node in either left or right subtree
        return dfsMatch(head.next, node.left) || dfsMatch(head.next, node.right);
    }
}




