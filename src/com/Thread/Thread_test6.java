package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Object>{
	@Override
	public 	Object call() throws Exception{
		int sum=0;
		for (int i=1; i<11;i++) {
			sum+=i;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			break;
		case "线程2":
			sum+=100;
		case "线程3":
			sum+=200;
		case "线程4":
			sum+=300;
		case "线程5":
			sum+=400;
		case "线程6":
			sum+=500;
		case "线程7":
			sum+=600;
		case "线程8":
			sum+=700;
		case "线程9":
			sum+=800;
		case "线程10":
			sum+=900;
			break;
		default:
			break;
		}
		return sum;
		
	}
}
public class Thread_test6 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread mt1=new MyThread();
		FutureTask<Object> ft1=new FutureTask<Object>(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		System.out.println("线程1求和的结果是"+ft1.get());
		MyThread mt2=new MyThread();
		FutureTask<Object> ft2=new FutureTask<Object>(mt1);
		Thread t2=new Thread(ft2,"线程2");
		t2.start();
		//System.out.println("线程2求和的结果是"+ft2.get());
		int total=(int)ft1.get()+(int)ft2.get();
		System.out.println("线程1和线程2的求和的结果是："+total);

	}

}
