package com.employer.innerClass;

public class StaticInnerClassDemo {
	public static int a=1;
	public int b=2;
	private static int c=3;
	private int d=4;

	static class InnerClass {
		public void doSomeThing() {
			/**
			 * Can only access fields (public, private, static)
			 * can't access non static (reference to the non-static in static context)
			 */
			System.out.println(a);
		}
	}

	public static void main(String... args) {
		new InnerClass().doSomeThing();
	}
}
