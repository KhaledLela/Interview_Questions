package com.employer.constractor;

public class ParentConstractorDemo extends B {
	public ParentConstractorDemo() {
		this("Demo");
		System.out.print("Demo");
	}

	public ParentConstractorDemo(String name) {
		super(name);
		System.out.print(name);
	}

	public static void main(String[] args) {
		new ParentConstractorDemo();
	}
}

class B {
	B(String name) {
	}
}