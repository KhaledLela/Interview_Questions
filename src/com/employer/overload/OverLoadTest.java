package com.employer.overload;

public class OverLoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Short ss = 4;
		short s = 6;
		long l = 7;
		go(ss);
		go(s);
		go(l);
	}

	public static void go(int i) {
		System.out.print("int ");
	}

	public static void go(Short i) {
		System.out.print("Short ");
	}

	public static void go(short i) {
		System.out.print("Primitive short ");
	}

	public static void go(Long i) {
		System.out.print("Long ");
	}
}
