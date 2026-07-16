package com.aman.oops.generics.comparing;

// why do we need comparable & comparator?

// we cannot compare 2 objects using operators like(<,>,<=,>=) because these operators only work with primitive types and not with objects.
//so java need a way to know which object comes first
// Arrays.sort() knows how to sort, but it does not know how to compare your objects.

// whenever it needs to compare 2 objects, it calls:
//compareTo() -> if using comparable
//compare() -> if using Comparator

// these methods return:
//negative -> first object comes first
//0 -> both objects are equal
// positive -> second object comes first
//Based on the returned value, the sorting algorithm arranges the objects

// comparable:
//implemented inside the class
//defines the natural/default ordering of objects

//comparator:
//implemented outside the class
//used to define custom or multiple ways of comparing the same objects.
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Student rahul = new Student(12, 90.24f);
		Student kunal = new Student(34, 89.92f);
		Student aman = new Student(23, 49.92f);
		Student vikram = new Student(43, 84.92f);
		Student punit = new Student(45, 85.92f);
		Student naina = new Student(65, 75.92f);

		Student[] list = { kunal, rahul, naina, aman, vikram, punit };
		System.out.println(Arrays.toString(list));

		Arrays.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {

				return (int) (o1.marks - o2.marks);

			}
		});
		System.out.println(Arrays.toString(list));

//		if (kunal.compareTo(rahul) < 0) {
//			System.out.println(kunal.compareTo(rahul));
//			System.out.println("Rahul is good in studies then the Kunal");
//		}

	}
}