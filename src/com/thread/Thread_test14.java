package com.thread;
class DeadLockThread implements Runnable{
	static Object chopsticks= new Object();
	static Object knifeAndFork= new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized(chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---if--chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if--knifeAndFork");
					}
					}
				}
			}else {
				while (true) {
					synchronized (knifeAndFork) {
							System.out.println(Thread.currentThread().getName()+"----eles----knifeAndFork");
						synchronized (chopsticks) {
							System.out.println(Thread.currentThread().getName()+"----eles----chopsticks");
						}
					}
				}
			}
		}
}
public class Thread_test14 {

	public static void main(String[] args) {
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		//创建并开启两个线程
		new Thread(new DeadLockThread(true),"Chinese").start();
		new Thread(new DeadLockThread(false),"American").start();

	}

}
