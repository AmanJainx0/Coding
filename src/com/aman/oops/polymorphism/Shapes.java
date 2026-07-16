package com.aman.oops.polymorphism;

public class Shapes {
    void area() {
        System.out.println("Runing the shapes class");
    }

}

class Circle extends Shapes {
    void area() {
        System.out.println("Runing the circle class");
    }
}

class Rectangle extends Shapes {

    void area() {
        System.out.println("Runing the rectangle class");
    }
}