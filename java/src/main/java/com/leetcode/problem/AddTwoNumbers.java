package com.leetcode.problem;

import java.util.Objects;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int takeOver = 0;
        ListNode root = null;
        ListNode previous = null;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        for (int i = 0; i < 100; i++) {
            if (curr1 == null && curr2 == null) {
                if (takeOver == 1) {
                    previous.next = new ListNode(takeOver, null);
                }
                return root;
            }

            int part1 = curr1 != null ? curr1.val : 0;
            int part2 = curr2 != null ? curr2.val : 0;
            int digit = part1 + part2 + takeOver;
            if (digit > 9) {
                digit = digit % 10;
                takeOver = 1;
            } else {
                takeOver = 0;
            }
            ListNode node = new ListNode(digit, null);
            if (i == 0) {
                root = node;
            } else {
                previous.next = node;
            }
            previous = node;
            curr1 = curr1 != null ? curr1.next : null;
            curr2 = curr2 != null ? curr2.next : null;
        }
        return root;
    }

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

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

    public static ListNode createListNode(int[] digits) {
        ListNode root = null;
        ListNode previous = null;
        for (int i = 0; i < digits.length; i++) {
            ListNode node = new ListNode(digits[i], null);
            if (i == 0) {
                root = node;
            } else {
                previous.next = node;
            }
            previous = node;
        }
        return root;
    }
}
