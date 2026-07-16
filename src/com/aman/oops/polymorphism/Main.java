package com.aman.oops.polymorphism;

// Method overriding

// Parent obj = new Child();
// Here, which method will be called depends on the type of object, this is known as "UPCASTING"

// How Java determines this?
// -> Dynamic method dispatch
// Java determines which method to call during runtime.

// static methods cannot be overriden as overriding depends on objects but static does not depends on objects, so static methods cannot be overriden.



public class Main {
    public static void main(String[] args) {
        Shapes s;
        s = new Circle();
        s.area();
        s = new Rectangle();
        s.area();
    }
}
