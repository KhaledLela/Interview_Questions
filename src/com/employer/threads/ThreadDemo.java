package com.employer.threads;

import java.util.ArrayList;
import java.util.List;


public class ThreadDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new ThreadDemo().go();
//		TreeSet<Integer> s = new TreeSet<Integer>();
//		TreeSet<Integer> sub = new TreeSet<Integer>();
//		for (int i = 606; i < 613; i++) {
//			if (i % 2 == 0)
//				s.add(i);
//		}
//		sub = (TreeSet<Integer>) s.subSet(608, 610);
//		s.add(609);
//		String s1 = "Hello"; // "F43534".
//		String s2 = "Hello"; // "F43534".
//		MyString ms1= new MyString("Hello");
//		MyString ms2= new MyString("Hello");
//		System.out.println(ms1.hashCode() + "---" +ms2.hashCode());
//		System.out.println(ms1 == ms2);
//		System.out.println(ms1.equals(ms2));
	}

	public void populate(List<? extends String> list){
		Object o = list;
		String s = list.get(0);
		List<String> list2 = new ArrayList<String>();
		list2.add("");
	}
	
	public void go() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.print("Demo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.start();
	}
	static class MyString {
		private String name;
		public MyString(String name){
			this.name = name;
		}
//		@Override 
//		public boolean equals(Object o){
//			if(this == o){
//				return true;
//			}
//			if(!(o instanceof MyString)){
//				return false;
//			}
//			MyString my =(MyString)o;
//			return Objects.equals(this.name, my.name);		
//		}
//	    @Override
//	    public int hashCode() {
//	       return this.name.hashCode();
//	    }
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		/* (non-Javadoc)
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
