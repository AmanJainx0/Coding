package com.aman.collections.linkedlist;

// 148 leetcode

import org.w3c.dom.Node;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;

    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode midPrev = null;

        while (fast != null && fast.next != null) {
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
        midPrev.next = null;

        return slow;
    }

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode() {

        }

        public ListNode(int value) {
            this.value = value;
        }
    }

}
