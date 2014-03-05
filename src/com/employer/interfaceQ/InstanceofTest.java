package com.employer.interfaceQ;

public class InstanceofTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Fish f = new walleye();
		 walleye w = new walleye();
		 if(f instanceof Perch)
			 System.out.print("F-p");
		 if(w instanceof Fish)
			 System.out.print(" w-F");
	}

}

class walleye extends Perch {

}

class Perch implements Fish {

}

interface Fish {
}