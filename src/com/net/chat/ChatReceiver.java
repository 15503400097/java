package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ChatReceiver implements Runnable {
	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket client) {
		this.ds=client;
				}

	@Override
	public void run() {
		
		//定义一个缓冲数组用于接收数据
		byte[] buf=new byte[1024];
		//定义一个数据报对象，用于封装接收数据
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		//在死循环里不断接收数据
		while(true) {
			try {
				ds.receive(dp);
				//构造获得的二进制数据，转换为String
				String xinxi=new String(dp.getData(),0,dp.getLength());
				//将获得的信息战士在控制台中
				System.out.println(dp.getAddress().getHostAddress()+":"+xinxi);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			

	}

}
}