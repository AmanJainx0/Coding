package com.aman.collections.linkedlist;

// 83. Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class R_Duplicate {

    public Node head;
    public Node tail;
    public int size;

    public R_Duplicate() {
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

    public void duplictes() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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
        R_Duplicate list = new R_Duplicate();
        list.insertFirst(10);
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(30);
        list.insertFirst(50);
        list.display();
        list.duplictes();
        list.display();
    }
}
