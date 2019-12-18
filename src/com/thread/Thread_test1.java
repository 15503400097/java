package com.thread;


class MyThread1 extends Thread{
	public MyThread1(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test1 {
	public static void main(String[] args) {
		new MyThread1("thread1").start();
		new MyThread1("thread2").start();
	}
}
