 package com.Thread;
class TicketWindow3 implements Runnable{
private int tickets=10;
	public void run() {
		//定义对象作为同步锁
		Object lock=new Object();
 while(true){
	 //同步代码块
	 synchronized(lock) {
	 if(tickets>0) {
		 try {
			 Thread.sleep(100);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 
	 }
		 System.out.println(Thread.currentThread().getName()
					+"正在卖第"+tickets--+"张票");
	 }else {break;}
	 		}
 		}
	}
}
public class Thread_test11 { 

	public static void main(String[] args) {
		TicketWindow3 tw=new TicketWindow3();
		new TicketWindow("窗口1").start();
		new TicketWindow("窗口2").start();
		new TicketWindow("窗口3").start();
		new TicketWindow("窗口4").start();

	}

}
