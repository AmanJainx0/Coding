package com.aman.collections.linkedlist;

public class LLCycle {

    private Node head;
    private Node tail;
    private int size;

    public LLCycle() {
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

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // LeetCode 141
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Length of the cycle
    public int lengthCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int count = 1;
                Node temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0;
    }

    // LeetCode 142
    public Node detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    // Creates a cycle for testing
    public void createCycle(int index) {
        if (head == null) {
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        tail.next = temp;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        LLCycle list = new LLCycle();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        // Create cycle: tail -> node at index 2 (value 30)
        list.createCycle(2);

        System.out.println("Has Cycle: " + list.hasCycle());

        System.out.println("Length of Cycle: " + list.lengthCycle());

        Node start = list.detectCycle();

        if (start != null) {
            System.out.println("Cycle starts at node: " + start.value);
        } else {
            System.out.println("No cycle found.");
        }
    }
}