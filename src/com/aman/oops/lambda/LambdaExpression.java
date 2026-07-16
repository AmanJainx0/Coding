package com.aman.oops.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression {
	public static void main(String[] args) {
//		int[] arr = { 3, 4, 6, 34 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			arr.add(i + 3);
		}
//		arr.forEach((item) -> System.out.println(item * 2));

		Consumer<Integer> fun = (item) -> System.out.println(item * 2);
		arr.forEach(fun);

		Operation sum = (a, b) -> a + b;
		Operation prod = (a, b) -> a * b;
		Operation sub = (a, b) -> a - b;
		Operation div = (a, b) -> a / b;

		LambdaExpression myCalculator = new LambdaExpression();
		System.out.println(myCalculator.ope(5, 3, prod));
		System.out.println(myCalculator.ope(565, 45, div));
		System.out.println(myCalculator.ope(53, 32, sum));
	}

	private int ope(int a, int b, Operation op) {
		return op.operation(a, b);
	}
}

interface Operation {
	int operation(int a, int b);

}
