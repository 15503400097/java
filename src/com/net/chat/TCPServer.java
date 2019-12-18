package com.net.chat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;import javax.sound.sampled.Port;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// 创建服务器套接字,监听8899端口
		ServerSocket fwqtjz=new ServerSocket(8899);
		//在死循环里不断监听
		while(true) {
			//获取客户端套接字
			Socket khdtjz=fwqtjz.accept();
			new Thread(()->{
				try {
				//通过客户端套接字获取客户端的IP地址
				String ip=khdtjz.getInetAddress().getHostAddress();
				//通过客户端套接字获取客户端的端口号
				int pork=khdtjz.getPort();
				System.out.println("和客户端ip地址是"+ip+",端口是"+pork+"连接上了");
				InputStream is=khdtjz.getInputStream();
				byte[]zjhc=new byte[1024];
				//定义文件输入流
				FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+"jpeg");
				//将缓冲区中的内容读入到输入流中，最后放到整形b中
				int b=is.read(zjhc);
				while(b!=-1) {
					fout.write(zjhc,0,b);
					//将字节缓冲信息转换成可以识别的字符串写到控制台
					//System.out.println(new String(zjhc,0,b));
					b=is.read(zjhc);
				}
				String xinxi="文件上传成功";
				zjhc=new byte[1024];
				//通过客户端套接字获取输入流
				OutputStream os;
					os = khdtjz.getOutputStream();
				//通过输入流写入网络
				os.write(xinxi.getBytes("UTF-8"));
				os.close();
				khdtjz.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			} ).start() ;	
		}
	}
}
