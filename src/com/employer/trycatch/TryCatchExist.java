package com.employer.trycatch;

public class TryCatchExist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doSomeThing();
	}

	private static void doSomeThing() {
		try {
			System.out.print("try ");
			throw new IllegalArgumentException("Exception");
		} catch (Exception e) {
			System.out.print("catch ");
			System.exit(0); 
		} finally {
			System.out.print("finally ");
		}
	}
}
