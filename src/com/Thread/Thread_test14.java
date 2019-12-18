package com.Thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
		DeadLockThread(boolean flag){
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					 System.out.println(Thread.currentThread().getName()
								+"---if---chopsticks");
				}
				synchronized (knifeAndFork) {
					 System.out.println(Thread.currentThread().getName()
								+"---if---knifeAndFork");

			}
		}
	}else {
	while(true) {
		synchronized (knifeAndFork) {
			 System.out.println(Thread.currentThread().getName()
						+"---if---knifeAndFork");
		synchronized (chopsticks) {
				 System.out.println(Thread.currentThread().getName()
							+"---if---chopsticks");
}
	}
		}		
			}
				}
					}
public class Thread_test14 {

	public static void main(String[] args) {
		//创建两个对象
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		//创建并开启两个路程
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"Americn").start();

	}

}
