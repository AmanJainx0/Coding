package com.aman.oops.abstraction;

abstract class Parent {
    abstract void career(String name);

    static void greet() {
        System.out.println("Hello! how r u?");
    }
    // abstract Parent(){
    // System.out.println("constructor called");
    // } cannot make a constructor of abstract type

}
// we can create constructors in abstract class but we can not create objects of
// abstract class
// we can call the constructors of abstract class using super keyword
// or we have to override it
// we can create static and normal methods in abstract class

// a class cannot inherit more than one classes or multiple inheritance is not
// supported in abstract classes

class Son extends Parent {
    void career(String name) {
        System.out.println(name);
    }
}

class Daughter extends Parent {
    void career(String name) {
        System.out.println(name);
    }
}