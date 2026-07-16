package com.aman.oops.abstraction.interfaces;

// its like an abstract class by default the methods are public ,abstract and the variables are static and final
// abstract class can provide the implementation of interface but vice versa is not possible
// a class can inherit more than one interfaces
// we can specify what a class must do and not how it does it



public class Car implements Engine, Brake{

    @Override
    public void stop() {
       System.out.println("Stop the car");
    }

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void acc() {
       System.out.println("Accelerate the car");
    }

    @Override
    public void brake() {
       System.out.println("Brake applied");
    }

}
