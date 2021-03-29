package com.jar.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapBasics{

	public static void main(String[] args) {
		//Calculator.main(args);
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put(null, null);
		hm.put("1",	"one");
		hm.put(null, "1");
		//hm.put(1, 1);
		
		System.out.println("The KEYSET is: "+hm.keySet()); // only keys
		System.out.println("The VALUES is: "+hm.values()); // only values
		System.out.println("The ENTRYSET is: "+ hm.entrySet()); // the entire entry
		
		Iterator<String> it = hm.keySet().iterator();
		
		
		while(it.hasNext()){
			System.out.println(" "+hm.get(it.next()));
		}
		
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("A");
		System.out.println("Set values:");
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext())
		{
			System.out.println(" "+it1.next());
		}
		
	}
}
