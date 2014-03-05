package com.employer.innerClass;

public class MethodInnerClassDemo {
	public static int a=1;
	public int b=2;
	private static int c=3;
	private int d=4;

	public void outerMethod(final int e){
		final int f = 0;
		class InnerClass {
			public void doSomeThing() {
				/**
				 * Can access all fields (public, private, static and non static)
				 * (f,e) must be final to be used in the inner class.
				 */
				System.out.println(e);
			}
		}
	}
}
