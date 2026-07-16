package com.aman.exception;

public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {

//			divide(a, b);
			String name = "aman";
			if (name.equals("aman")) {
				throw new MyException("my name is aman");
			}

		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("normal exception");
		}

		finally {
			System.out.println("final block ");
		}
	}

	static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("b cant be 0");
		}
		return a / b;
	}
}
