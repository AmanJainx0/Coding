package com.aman.cloning;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human aman = new Human("Aman", 21);
//		Human amit = new Human(aman);
		Human twin = (Human)aman.clone();
		System.out.println(twin.age+ " "+twin.name);
	}
}
