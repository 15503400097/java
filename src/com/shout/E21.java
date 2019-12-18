package com.shout;
@FunctionalInterface
interface Animal{
	void shout();

}
@FunctionalInterface
interface Compute{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
		
	}
	
}
public class E21 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.shout();
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("汪汪");
				
			}
		});
		animalShout(()->{System.out.println("aow····");
						System.out.println("I am a Tiger");});
		showSum(10,30,(x,y)->x+y);
	}

	private static void showSum(int i, int j, Compute c) {
		System.out.println(i+"+"+j+"的和为"+c.sum(i, j));
		
	}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
