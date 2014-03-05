package com.employer.trycatch;

public class TryCatchReturn {

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
			return;
		} finally {
			System.out.print("finally ");
		}
	}
}
