package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_ {

	public static void main(String[] args) {
		Map<String,String> hmap=new HashMap<String,String>();
		hmap.put("1","jack");
		hmap.put("2","rose");
		hmap.put("3","pete");
		System.out.println(hmap);
		
		if(hmap.containsKey("1")) {
			System.out.println("这个双列集合包含建1");;
		}
		System.out.println("这个双列集合包中建1的值是"+hmap.get("1"));
	
	//将双列集合Map变成单列的键对象集合使用KeySet（）方法
	//将双列集合Map变成单列的值对象集合使用KeySet（）方法
		System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
		System.out.println("这个双列集合中所有键的集合是"+hmap.values());
	//将键位1的值改成andy
	hmap.replace("1","Andy");
	System.out.println(hmap);
	//删除1对应的键key值+value=对entry
	hmap.remove("1");
	System.out.println(hmap);
	
	System.out.println("用键集遍历双列集合的键和值");
	//将双列集合MAP变成单列的键对象集合使用Keyset（）方法
	Set<String> jianji=hmap.keySet();
	Iterator<String> diedai=jianji.iterator();
	while(diedai.hasNext()) {
		Object key=(Object)diedai.next();
		Object value=hmap.get(key);
		System.out.println(key+":"+value);
	}
	System.out.println("用键值对集遍历双列集合的键和值");
	//将双列集合MAP变成单列的键对象集合使用KeySet（）方法
	Set<Map.Entry<String,String>> jianzhiduiji=hmap.entrySet();
	Iterator<Map.Entry<String,String>> diedai2=jianzhiduiji.iterator();
	while(diedai2.hasNext()) {
		Map.Entry<String,String> jianzhidui=diedai2.next();
		Object key=jianzhidui.getKey();
		Object value=jianzhidui.getValue();
		System.out.println(key+":"+value);
	}
	
	System.out.println("用forech键值对集遍历双列集合的键和值");
	hmap.forEach((key,value)->System.out.println(key+":"+value));
	
	System.out.println("用foreach键值对集遍历双列集合的所有值");
	Collection<String> zhiji=hmap.values();
	zhiji.forEach(value->System.out.println(value));
	
	Map<String,String> hmap2=new LinkedHashMap<String, String>();
	hmap2.put("2","jack");
	hmap2.put("1","rose");
	hmap2.put("3","rosr");
	hmap2.put("2","rosr");
	System.out.println(hmap2);
	
}
}
