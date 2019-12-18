package com.jihe;

import java.util.TreeSet;
class Teacher implements Comparable<Object>{
	
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+":"+age;
		
	}
	@Override
	public int compareTo(Object o) {
		Teacher t=(Teacher)o;
		return t.age-this.age;
	}
	
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("压索", 17));
		ts.add(new Teacher("瑞文", 18));
		ts.add(new Teacher("亚托克斯", 20));
		ts.add(new Teacher("压索", 17));
		System.out.println(ts);
	}

}
