package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;
class Mycomparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.length()-s2.length();
	}
	
}
public class TreeSet_test3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new Mycomparator());
		ts.add("Jack");
		ts.add("Yasuo");
		ts.add("Ruiwen");
		ts.add("Rose");
		System.out.println(ts);
		
		TreeSet<String> ts1=new TreeSet<String>((obj1,obj2)->{
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
		});
		ts1.add("Jack");
		ts1.add("Yasuo");
		ts1.add("Ruiwen");
		ts1.add("Rose");
		System.out.println(ts1);

	}

}
