package com.abstract_;
abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{
	@Override
	 void shout() {
		 System.out.println("汪汪·······");
	}
}
class Cat extends Animal{
	@Override
	 void shout() {
		 System.out.println("喵喵·······");
	}
}
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		Cat cat=new Cat();
		cat.shout();
	}

}
