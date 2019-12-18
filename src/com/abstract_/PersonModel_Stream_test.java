package com.abstract_;

import java.util.*;
import java.util.stream.Collectors;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("Wang Yu",18,"男");
		PersonModel p2=new PersonModel("Zhang San",20,"nan");
		PersonModel p3=new PersonModel("Li Si",22,"女");
		PersonModel p4=new PersonModel("Zhao Qiao",28,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		//old
		for (PersonModel pm:list) {
			System.out.println(pm.getName());
		}
		//new1
		List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new2
		List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
		System.out.println(list3);
				
		//new3
		List<String> list4=list.stream().map(a->{
		
			return a.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}

}
