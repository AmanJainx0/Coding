package com.aman.collections.linkedlist;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertPos(3, 4);
        list.insertPos(0, 0);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deletePos(5));
        list.display();
        System.out.println(list.find(20));
    }
}
