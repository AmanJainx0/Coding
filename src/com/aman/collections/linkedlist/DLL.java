package com.aman.collections.linkedlist;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node temp = new Node(value);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
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
        Node current = get(pos - 1);
        Node temp = new Node(value);
        temp.next = current.next;
        current.next = temp;
        temp.prev = current;
        if (temp.next != null) {

            temp.next.prev = temp;
        }
        size++;

    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail.prev = null;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return value;
    }

    public int deletePos(int pos) {
        if (pos == 0) {
            return deleteFirst();
        }
        if (pos == size - 1) {
            return deleteLast();
        }
        Node temp = get(pos - 1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return value;
    }

    public Node get(int pos) {
        Node node = head;
        for (int i = 0; i < pos; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("END");
    }

    public void displayLast() {
        if (tail == null) {
            System.out.println("START");
            return;
        }
        Node curr = tail;
        while (curr.prev != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.prev;
        }
        System.out.print(curr.value + " -> START");
    }

    private class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
