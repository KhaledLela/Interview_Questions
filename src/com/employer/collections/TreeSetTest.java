package com.employer.collections;

import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> sub = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++) {
			if (i % 2 == 0)
				s.add(i);
		}
		sub = (TreeSet<Integer>) s.subSet(608, 611);
//		s.add(609);
		s.add(629);
		System.out.println(s + " " + sub);
	}
}
