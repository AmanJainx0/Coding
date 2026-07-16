package com.aman.collections.linkedlist;

public class DLLMain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.insertPos(2, 5);
        list.display();
        // list.displayLast();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deletePos(2));
        list.display();
    }
}
