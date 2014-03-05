package com.employer.trycatch;

public class CatchOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			args = null;
			args[0] = "test";
		} catch (Exception e) {
			System.out.print("Exception");
		} 
//		catch (NullPointerException npe) {
//			System.out.print("Exception");
//		}
	}
}
