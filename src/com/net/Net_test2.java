package com.net;

import java.net.*;

public class Net_test2 {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str ="来自薛天赐的问候";
		byte[] zjsz=str.getBytes();
		DatagramPacket packet=new DatagramPacket(str.getBytes(),
							  str.getBytes().length,
							  InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}

}
