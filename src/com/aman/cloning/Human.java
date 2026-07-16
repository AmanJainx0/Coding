package com.aman.cloning;

import java.lang.classfile.Superclass;

public class Human implements Cloneable {

	String name;
	int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	public Human(Human o) {
//		this.name = o.name;
//		this.age = o.age;
//	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
