package com.employer.interfaceQ;

public class Example {

	interface Base{
		String getName();
		Base getInstance();
	}
	
	class AImpBase implements Base{

		@Override
		public String getName() {
			return "A implementation";
		}

		@Override
		public Base getInstance() {
			return this;
		}
	}
	
	class BImpBase implements Base{

		@Override
		public String getName() {
			return "B implementation";
		}

		@Override
		public Base getInstance() {
			return this;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example ex = new Example();
		Base b = ex.new BImpBase();
		System.out.println(b.getName());
	}

}
