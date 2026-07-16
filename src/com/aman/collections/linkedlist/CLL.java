package com.aman.collections.linkedlist;

public class CLL {

    public Node head;
    public Node tail;
    public int size;

    public CLL() {
        this.size = 0;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
        return;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.value == val) {
            head = head.next;
            tail.next = node;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
        size--;

    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
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
    }
}
