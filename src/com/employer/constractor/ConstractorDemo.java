package com.employer.constractor;

public class ConstractorDemo extends A{
	public ConstractorDemo(){
		System.out.print("Demo");
	}
	public static void main(String[] args){
		new ConstractorDemo();
	}
}

class A {
	A(){
		System.out.print("A");
	}
}