package com.shout;
@FunctionalInterface
interface printable{
	void printf(String str);
}
class StringUtils{
	public void printUpper(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {

	public static void main(String[] args) {
		StringUtils su=new StringUtils();
		printUpper("hello",t->su.printUpper(t));
		printUpper("world",su::printUpper);
	}

	private static void printUpper(String str, printable t) {
		t.printf(str);
		
	}

}
