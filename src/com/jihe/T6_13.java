package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator<Object>{
		public int compare(Object Obj1,Object obj2) {
			String s1=(String) Obj1;
			String s2=(String) obj2;
			int temp=s1.length()-s2.length();
			return temp;
		}
	}
public class T6_13 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new myComparator());
		ts.add("IAVK");
		ts.add("hhh");
		ts.add("zz");
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<String>((obj1,obj2)->{
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
		});
		ts2.add("jake");
		ts2.add("zz");
		ts2.add("dd");
		System.out.println(ts2);
	}

}
