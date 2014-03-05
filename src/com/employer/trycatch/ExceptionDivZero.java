package com.employer.trycatch;

public class ExceptionDivZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cal();
	}

	public static void cal() {
		try {
			int x = 10;
			float y = x / 0;
			System.out.print("Y = " + y);
		} catch (Error e) {
			System.out.print("Runtime Exception");
		}
	}
	
	public static <T> T doWork(T x,T y){
//		return x>y?x:y;
		return x.equals(y) ? x:y;
	} 
}
