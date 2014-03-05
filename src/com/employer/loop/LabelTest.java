package com.employer.loop;

public class LabelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String o="";
		o=o+2;
		z:
		for(int x=3;x<8;x++){
			if (x==4)
				continue;
			if(x==6)
				break z;
			o = o+x;
		}
		System.out.println(o);
	}
}
