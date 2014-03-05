package com.employer.interfaceQ;

public class TwoInterfaceSameMethod implements A,B{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "";
	}

}

 interface A{
	String getName();
}
 interface B{
	String getName();
}