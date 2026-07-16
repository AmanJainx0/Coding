package com.aman.oops.inheritance;

import java.util.Scanner;

class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void display() {
        super.display();
        System.out.println("Roll No : " + rollNo);
        System.out.println("-----------------------");
    }

    void changeName(String newName) {
        this.name = newName;
    }

    static int search(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}

public class PMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        students[0] = new Student("Aman", 20, 101);
        students[1] = new Student("Rahul", 21, 102);
        students[2] = new Student("Priya", 19, 103);

        System.out.println("Student Details");
        System.out.println("=================");
        for (Student s : students) {
            s.display();
        }

        System.out.print("Enter the name to search: ");
        String oldName = sc.nextLine();

        int index = Student.search(students, oldName);

        if (index != -1) {
            System.out.print("Enter the new name: ");
            String newName = sc.nextLine();

            students[index].changeName(newName);

            System.out.println("\nName updated successfully!");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nUpdated Student Details");
        System.out.println("=======================");
        for (Student s : students) {
            s.display();
        }

    }
}
