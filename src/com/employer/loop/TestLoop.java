package com.employer.loop;

public class TestLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object obj = new int[]{1,2,3};
		int [] a = (int[])obj;
		for(int n : a){
			System.out.print(n + " ");
		}
	}

}
