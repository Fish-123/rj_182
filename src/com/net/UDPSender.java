package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(30000);
		//定义要发送的数据
		String str="来自赵云的问候";
		//将数据转换为二进制字节数组
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length, InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息....");
		ds.send(dp);
		ds.close();
		

	}

}
