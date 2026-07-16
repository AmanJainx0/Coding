package com.aman.oops.generics.comparing;

public class Student implements Comparable<Student> {
//	implements Comparable<student> tells that student objects can be compared with each other
//	the generic type <student> means compareTo() will compare one student object with another object 
	int rollNo;
	float marks;

	public Student(int rollNo, float d) {
		this.rollNo = rollNo;
		this.marks = d;

	}
// toString() provides a readable representation of the object, so System.out.println() prints meaningful data instead of the default object reference.
	public String toString() {
		return marks + " ," + rollNo;
	}
//Arrays.sort() repeatedly calls compareTo() while sorting the array.
	@Override
	public int compareTo(Student o) {
//		compareTo(Student o) defines the natural/default ordering of student objects.
//		this refers to the current object, and o refers to the object being compared
//		The method returns:
//		1 → current object (this) is greater.
//		-1 → current object (this) is smaller.
//		0 → both objects are equal.
		System.out.println("runing in compareTo method");
		if (this.marks > o.marks)
			return 1;
		if (this.marks < o.marks)
			return -1;
		return 0;
	}
}
