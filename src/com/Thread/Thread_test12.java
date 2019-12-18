 package com.Thread;
class TicketWindow4 implements Runnable{
private int tickets=10;
	public void run() {
		while(true){
			maipiao();
		}
	}
	 private synchronized void maipiao(){
		 if(tickets>0) {
			 try {
				 Thread.sleep(100);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
	 }
		if(tickets>0) {
		 System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
	 		}
 		}
	}
}
public class Thread_test12{ 

	public static void main(String[] args) {
		TicketWindow4 tw=new TicketWindow4();
		new TicketWindow("窗口1").start();
		new TicketWindow("窗口2").start();
		new TicketWindow("窗口3").start();
		new TicketWindow("窗口4").start();
	}
}
