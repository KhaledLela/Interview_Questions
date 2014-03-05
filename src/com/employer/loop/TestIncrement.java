package com.employer.loop;


public class TestIncrement {

	private Integer x =0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(new TestIncrement().increment());
	}

	public int increment(){
		return x++;
	}
}
