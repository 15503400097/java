package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int port;
	public ChatSender(DatagramSocket ds, int i) {
		this.ds=ds;
		this.port=port;
	}
	@Override
	public void run() {
		Scanner scanner=new Scanner(System.in);
		while(true) {
		
		try {
			System.out.println("我说:");
			String str=scanner.nextLine();
			byte[] zjsz=str.getBytes("UTF-8");
			System.out.println("这条信息要发给哪个IP:");
			String ip=scanner.nextLine();
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName(ip),8900);
			ds.send(dp);	
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	}
	}


