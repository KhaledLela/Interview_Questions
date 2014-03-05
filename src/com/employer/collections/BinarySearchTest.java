package com.employer.collections;

import java.util.Arrays;

public class BinarySearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] colors = {"blue","red","green","yellow","orange"};
		Arrays.sort(colors);
		for(String c : colors)
		System.out.print(c + "- ");
		System.out.println();
		int s1 = Arrays.binarySearch(colors, "orange");
		int s2 = Arrays.binarySearch(colors, "violet");
		System.out.println(s1 + "-" + s2);
	}
}
