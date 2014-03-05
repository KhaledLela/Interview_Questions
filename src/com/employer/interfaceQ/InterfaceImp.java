package com.employer.interfaceQ;

public class InterfaceImp {
	static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceImp obj = new InterfaceImp();
		obj.printCounter();
		obj.printCounter();
	}

	private void printCounter() {
		// static int count=0; //Illegal modifier for parameter count; only
		// final is permitted
		// int count=0; //Cannot refer to a non-final variable count inside an
		// inner class defined in a different method
		new Counter() {
			@Override
			public void count() {
				count++;
			}
		};
	}
}

interface Counter {
	void count();
}