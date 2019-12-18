package com.charAt;

public class E52 {

	public static void main(String[] args) {
		String p1="a1bv7我uh3爱vk7你ahv中1kl国7hv4i.2a1a2a4";
		/*System.out.println("字符串p1的字符长度是:"+p1.length());
		System.out.println("字符串p1的第一个字符是:"+p1.charAt(0));
		System.out.println("字符串p1字符a的第一个位置是:"+p1.indexOf('a'));
		System.out.println("字符串p1字符a的最后一个位置是:"+p1.lastIndexOf(97));
		System.out.println("字符串p1字符串ah的第一个位置是:"+p1.indexOf("ah"));
		System.out.println("字符串p1字符串ah的最后一个位置是:"+p1.lastIndexOf("ah"));*/
		/*if(p1.startsWith("a")) {
			System.out.println("这个字符串以a开头");
		}
		if(p1.endsWith("aaa")) {
			System.out.println("这个字符串以aaa结尾");
		}
		if(p1.contains("ahv")) {
			System.out.println("这个字符串包含ahv");
		}
		if(!p1.isEmpty()) {
			System.out.println("这个字符串不为空");
		}*/
		p1.toCharArray();
		char [] zfsz=p1.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
		if(i==zfsz.length-1) {
			System.out.print(c);
		}else
			System.out.print(c+",");
		}
		System.out.println();
		System.out.println("这个字符串的数字是:");
		for(char zf : zfsz) {
			if(zf>='0'&& zf<='8') {
				System.out.print(zf);
			}
		}
		System.out.println();
		System.out.println("这个字符串的字母是:");
		for(char zf : zfsz) {
			if(zf>='a'&& zf<='z') {
				System.out.print(zf);
			}
		}
		System.out.println();
		System.out.println("这个字符串的汉字是:");
		for(char zf : zfsz) {
			if(zf>='\u4E00'&& zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
