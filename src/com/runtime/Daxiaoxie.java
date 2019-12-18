package com.runtime;

public class Daxiaoxie {

	public static void main(String[] args) {
		String zf=new String("HelloWorld");
		for (int i = zf.length()-1; i >=0; i--) {
			if(zf.charAt(i)>='a'&&zf.charAt(i)<='z') {
				System.out.print((char)(zf.charAt(i)-32));	
			}
			else if(zf.charAt(i)>='A'&&zf.charAt(i)<='Z'){
				System.out.print((char)(zf.charAt(i)+32));	
			}
			
		}

	}

}
