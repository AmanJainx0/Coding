package com.aman.collections.linkedlist;

public class CLLMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(45);
        list.insert(34);
        list.insert(23);
        list.insert(12);
        list.insert(10);
        list.display();

        list.delete(23);
        list.display();
    }
}
 