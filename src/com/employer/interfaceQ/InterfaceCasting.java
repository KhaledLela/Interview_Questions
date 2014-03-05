package com.employer.interfaceQ;

public class InterfaceCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B b = new SubB();
		SubB sb = (SubB)b;
	}

}
class SubB implements B{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}