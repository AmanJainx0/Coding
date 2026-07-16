package com.aman.oops.abstraction.interfaces.extend2;

import java.awt.DefaultFocusTraversalPolicy;

public interface A {
//	static interface methods should always have a body
//	call via the interface name
	static void welcome() {
		System.out.println("hey i am static method");

	}

	default void fun() {
		System.out.println("Hello this is interface A");
	};
}
