package com.jar.implementation;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicatesUsingHashMap {

	public static void main(String[] args) {
		int a[] = { 4, 87, 2, 7, 99, 33, 77, 33, 7, 99 };

		duplicateUsingForLoop(a);
		duplicateUsingHashMap(a);
	}

	private static void duplicateUsingForLoop(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			if (count == 1)
				System.out.println("Duplicate element is: " + a[i]);
		}

	}

	private static void duplicateUsingHashMap(int[] a) {
		System.out.println("Finding duplicate using HashMap...");
		HashMap<Integer, Integer> hm = new HashMap<>();

		/*for (int i = 0; i < a.length; i++) {

			if (hm.get(a[i]) != null) {

				hm.put(a[i], hm.get(a[i]) + 1);
			} else {

				hm.put(a[i], 1);
			}
		}*/
		
		
		for(int number : a){
			if(hm.get(number) != null){
				hm.put(number, hm.get(number)+1);
			}
			else
				hm.put(number, 1);
		}
		Iterator<Integer> it= hm.keySet().iterator();
		
		while(it.hasNext()){
			int temp=it.next();
			
			if(hm.get(temp) >1)
				System.out.println("Duplicate element is: "+ temp);
		}
	}
}
