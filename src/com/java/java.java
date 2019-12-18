package com.java;
/*
 * 紫色的代码是关键字       package包名、public修饰符、class类、static静态     也是修饰符、void空的表示没有返回值
 * 褐色的代码是参数或局部变量
 * 蓝色的代码是成员变量，地位比局部变量高，同成员方法一样
 * 黑的的代码是标识符       包名、类名（类名首字母大写）、方法名、整型字面量
*/
/**title:helloword
 * @author Administrator
 *@version 1.0
 */
public class java {
	/**
	 * 这是一个main()方法入口
	 * @param args 参数名
	 *
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte a=1;
		short b=1;
		int c=1;
		long d=1;
		System.out.println("字节型整数的字节是："+Byte.SIZE);
		System.out.println("短整型整数的字节是："+Short.SIZE);
		System.out.println("整型整数的字节是："+Integer.SIZE);
		System.out.println("长整型整数的字节是："+Long.SIZE);
		System.out.println("字节型整数的范围是："+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("短整型整数的范围是："+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("整型整数的范围是："+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("长整型整数的范围是："+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	}

}
