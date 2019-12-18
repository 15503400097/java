package com.jihe;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Customcomparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
	
}

public class Bct_2 {

	public static void main(String[] args) {
		Map<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1,"Jack");
		hmap.put(2,"Rose");
		hmap.put(3,"Yasuo");
		hmap.put(4,"Ruiwen");
		hmap.put(5,"ruizi");
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<Integer> jianji=hmap.keySet();
		Iterator<Integer> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
	}

}
