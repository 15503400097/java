package com.final_;
class Animal{
	
	final String name="动物";
	
	public void shout() {
		
	}
	@Override
	public String toString() {
		return "这是一只猪";
	}
}
class Dog extends Animal{
	String name="小狗";
	@Override
	public final void shout() {
		
	}
	@Override
	public String toString() {
		return "是一只佩奇";
	}
}
public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xz=new Dog();
		System.out.println(dw);
		System.out.println(xz);

	}

}
