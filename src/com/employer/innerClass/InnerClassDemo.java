package com.employer.innerClass;

public class InnerClassDemo {
	public static int a=1;
	public int b=2;
	private static int c=3;
	private int d=4;

	class InnerClass {
		public int e =0;
		public void doSomeThing(int f) {
			/**
			 * Can access all fields (public, private, static and non static)
			 */
			System.out.println(f);
		}
	}

	public static void main(String... args) {
		InnerClassDemo outer = new InnerClassDemo();
		outer.new InnerClass().doSomeThing(10);
		
		//Test static inner instantiation 
		StaticInnerClassDemo.InnerClass obj = new StaticInnerClassDemo.InnerClass();
		obj.doSomeThing();
	}
}
