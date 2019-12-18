package com.jihe;

import java.util.*;
import java.util.Map.Entry;
public class Map_test {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Map<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1,"Jack");
		hmap.put(2,"Rose");
		hmap.put(3,"Yasuo");
		hmap.put(4,"Ruiwen");
		System.out.println(hmap);
		if (hmap.containsKey(3)) {
			System.out.println("这个Map包含键3");
		}
		System.out.println("这个Map键3的元素为:"+hmap.get(3));
		
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
		System.out.println("这个双列集合中所有键的集合是"+hmap.values());
		//将键为1的值改成Andy
		hmap.replace(null, "1","Andy");
		System.out.println(hmap);
		//删除键1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<Integer> jianji=hmap.keySet();
		Iterator<Integer> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<Entry<Integer, String>> jianzhiduiji=hmap.entrySet();
		Iterator<Entry<Integer, String>> diedai2=jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Map.Entry<String,String> jianzhidui=(Map.Entry)diedai2.next();
			Object key =jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);
		}
		
		System.out.println("用foreach键值对集遍历双列集合的键和值");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> zhiji=hmap.values();
		zhiji.forEach(value->System.out.println(value));
		
		Map<Integer, String> hmap2=new LinkedHashMap<Integer, String>();
		hmap2.put(2,"Jack");
		hmap2.put(1,"Rose");
		hmap2.put(3,"Yasuo");
		hmap2.put(4,"Ruiwen");
		System.out.println(hmap2);
	}
}
