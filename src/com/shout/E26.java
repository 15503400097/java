package com.shout;

import javax.print.attribute.standard.PrinterName;

@FunctionalInterface
interface PersonBuilder{
	Person  bulidPerson(String name);
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
}
public class E26 {
	
	public static void main(String[] args) {
		printName("蔡徐坤",name->new Person(name));
		printName("乔碧罗", Person::new);
		printName("蔡碧", new PersonBuilder() {
			
			@Override
			public Person bulidPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
	}

	private static void printName(String name, PersonBuilder sa) {
		System.out.println(sa.bulidPerson(name).getName());
		
	}

}
