package com.employer.io;

import java.util.Scanner;

public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String cvs = "28, 28, 28";
		Scanner sc = new Scanner(cvs);
		sc.useDelimiter(",");
//		String name = sc.next();
		int age = sc.nextInt();
		System.out.print(age);
	}

}
