package com.shout;
@FunctionalInterface
interface printable_{
	void printf(StringUtils su,String str);
}
public class E27 {

	public static void main(String[] args) {
		printUpper(new StringUtils(),"hello",(Object,t)->Object.printUpper(t));
		printUpper(new StringUtils(),"world",StringUtils::printUpper);

	}

	private static void printUpper(StringUtils su,String str,printable_ t) {
		t.printf(su, str);
		
	}

	

}
