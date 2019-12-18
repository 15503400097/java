package com.interface_;
interface Animal{
	//接口成员变量申明时，可以省略public static final三个
	int ID=1;
	//接口成员方法声明时,可以省略public abstract两个
	abstract void shout();
	//接口内不能有普通方法,可以有静态
	static int getID() {
		return Animal.ID;
		
	}
}
interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
	@Override
	public void shout() {
		 System.out.println("汪汪·······");
	}

	@Override
	public void run() {
		System.out.println("狗在呼吸");
		
	}
}
class Cat implements Animal{
	@Override
	public void shout() {
		 System.out.println("喵喵·······");
	}
}
public class E13 {

	public static void main(String[] args) {
		System.out.println(Animal.getID());
		Dog dog=new Dog();
		dog.run();
		
		dog.shout();
		Cat cat=new Cat();
		cat.shout();
	}

}

