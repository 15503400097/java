package com.java;

import java.io.Serializable;

//继承                                实现
public class Lei extends Object implements Serializable{
	
	public static final class A extends Object implements Serializable {}//公用
	protected static final class B extends Object implements Serializable {}//受保护的
	static final class D extends Object implements Serializable {}
	private static final class  C extends Object implements Serializable{}//私有的

	public static int age;
	public static String name;
	//两个成员方法   修饰符+返回值数据类型+成员方法名（）{}
	//void为空  不需要return返回语句,
	//使用return语句的变量名必须和所定义的语句变量名的类型一样
	public synchronized void setage(int nianling) {}
	public synchronized int getage(int a) {
		return 0;
	}
}
