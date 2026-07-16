package com.aman.collections.linkedlist;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
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

    public void insertPos(int pos, int value) {
        if (pos == 0) {
            insertFirst(value);
            return;
        }
        if (pos == size) {
            insertLast(value);
            return;
        }

        Node current = head;
        for (int i = 1; i < pos; i++) {
            current = current.next;

        }
        Node temp = new Node(value);
        temp.next = current.next;
        current.next = temp;
        size++;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public Node get(int pos) {
        Node node = head;
        for (int i = 0; i < pos; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }

    public int deletePos(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }
        if (pos == size - 1) {
            return deleteLast();
        }
        Node temp = get(pos - 1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;

        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        // @Override
        // public String toString() {
        //     return String.valueOf(value);
        // }
    }
}
