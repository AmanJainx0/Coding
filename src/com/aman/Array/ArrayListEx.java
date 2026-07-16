package com.aman.Array;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.set(0, 15);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
