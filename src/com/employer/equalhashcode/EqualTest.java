package com.employer.equalhashcode;

import java.util.HashSet;
import java.util.Set;


public class EqualTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new HashSet();
		String s1 = "Hello"; // "F43534".
		String s2 = "Hello"; // "F43534".
		MyString ms1 = new MyString("Hello");
		MyString ms2 = new MyString("Hello");
		
		set.add(s1);
		set.add(s2);
		set.add(ms1);
		set.add(ms1);
		System.out.println(ms1.hashCode() + "---" + ms2.hashCode());
		System.out.println(ms1 == ms2);
		System.out.println(ms1.equals(ms2));
		System.out.println(set.size());		
	}

	static class MyString {
		private String name;

		public MyString(String name) {
			this.name = name;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof MyString)) {
				return false;
			}
			MyString other = (MyString) obj;
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			return true;
		}
	}
}
