package com.aman.collections.linkedlist;

// 21. Merge Two Sorted Lists

// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

public class MergeList {
    public Node head;
    public Node tail;
    public int size;

    public MergeList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public static MergeList merge(MergeList l1, MergeList l2) {
        Node fir = l1.head;
        Node sec = l2.head;
        MergeList ans = new MergeList();

        while (fir != null && sec != null) {
            if (fir.value < sec.value) {
                ans.insertLast(fir.value);
                fir = fir.next;
            } else {
                ans.insertLast(sec.value);
                sec = sec.next;
            }
        }
        while (fir != null) {
            ans.insertLast(fir.value);
            fir = fir.next;
        }
        while (sec != null) {
            ans.insertLast(sec.value);
            sec = sec.next;
        }
        return ans;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeList l1 = new MergeList();
        MergeList l2 = new MergeList();

        l1.insertLast(1);
        l1.insertLast(1);
        l1.insertLast(4);
        l1.insertLast(6);
        l1.insertLast(67);
        l1.insertLast(68);
        l2.insertLast(2);
        l2.insertLast(4);
        l2.insertLast(5);
        l2.insertLast(5);
        l2.insertLast(78);
        l2.insertLast(87);
        l2.insertLast(89);
        l2.insertLast(90);
        l1.display();
        l2.display();

        MergeList ans = MergeList.merge(l1, l2);
        ans.display();

    }

}