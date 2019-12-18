package com.Thread;
class  MyThread1 extends Thread{
	public MyThread1(String name) {
		super(name);
	}

public void run() {
	int i=0;
	while(i++<5) {
		System.out.println(Thread.currentThread().getName()
				+"的run()方法在运行");
		}
 	}
}
public class Thread_test {

	public static void main(String[] args) {
		MyThread2 mt1=new MyThread2();
		Thread t1=new Thread(mt1,"线程1");
		t1.start();
		MyThread2 t2=new MyThread2();
		new Thread(t2,"线程2").start();
	}

}
