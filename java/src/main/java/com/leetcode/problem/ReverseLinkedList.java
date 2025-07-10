package com.leetcode.problem;

public class ReverseLinkedList {

    static public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode a = null;
        ListNode b = head;
        ListNode c = head != null ? head.next : null;

        while (b != null) {
            System.out.println();
            b.next = a;
            a = b;
            b = c;
            c = c != null ? c.next : null;
        }
        return a;
    }
}




