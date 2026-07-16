package com.aman.oops.generics;

import java.util.Arrays;

public class CustemGenericArrayList<T> {
	private Object[] data;
	private static int default_size = 10;
	private int size = 0;

	public CustemGenericArrayList() {
		this.data = new Object[default_size];
	}

	public void add(T num) {

		if (isFull()) {
			resize();

		}
		data[size++] = num;
	}

	private boolean isFull() {

		return size == data.length;
	}

	private void resize() {
		Object[] temp = new Object[2 * data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];

		}
		data = temp;

	}

	public void set(int index, T value) {
		data[index] = value;
	}

	public T remove() {
		T removed = (T) data[--size];
		return removed;
	}

	public T get(int index) {
		return (T) data[index];
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
	}

	public static void main(String[] args) {
		CustemGenericArrayList<String> list = new CustemGenericArrayList<>();
		for (int i = 0; i < 9; i++) {
			list.add("hello" + i);
		}
		System.out.println(list);
	}
}
