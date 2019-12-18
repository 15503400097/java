package com.ljhs;
class Person{
	public void finalize() {
		System.out.println("该对象将被作为垃圾回收···");
	}
}
public class E37 {

	public static void main(String[] args) {
		ljhs1();
		System.out.println("----------------");
		ljhs2();
	}

	private static void ljhs2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		for (int i = 0; i < 10; i++) {
		System.out.println("方法二循环中······");
			
		}
		
	}

	private static void ljhs1() {
		Person p1=new Person();
		p1=null;
		for (int i = 0; i < 10; i++) {
		System.out.println("方法一循环中······");
			
		}
		
	}

}
