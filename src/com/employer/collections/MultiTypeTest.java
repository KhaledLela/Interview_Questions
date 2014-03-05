package com.employer.collections;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeTest extends SuperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperClass inst = new MultiTypeTest();
		List<? super String> l = inst.addStrings(new ArrayList<String>());
		System.out.println(l);
	}

	//
	// public List addStrings(List<? super String> s) {
	// s.add("Khaled");
	// return s;
	// }
	
}

class SuperClass {
	public final List<? super String> addStrings(List<? super String> lst) {
		lst.add("Super");
		return lst;
	}
}