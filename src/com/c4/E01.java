package com.c4;
 class Animal{
	String name;
	void shout() {
		System.out.println("动物发出叫声");
}
	}
 class Dog extends Animal{
	 //方法的重写
	 @Override
	 void shout() {
	System.out.println("汪汪...........");
}
	 public void printName() {
		System.out.println("name="+name);
	}
 }
 
public class E01 {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="金毛";
		dog.printName();
		dog.shout();

	}

}
