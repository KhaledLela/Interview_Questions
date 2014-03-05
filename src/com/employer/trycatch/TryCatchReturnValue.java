package com.employer.trycatch;

public class TryCatchReturnValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getX());
	}

	private static int getX() {
		int x=0;
		try {
			x= 12;
			return x;
		} finally {
			return x;
		}
	}
}
