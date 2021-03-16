package com.jar.implementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class WordCountUsingHM {

	public static void main(String[] args) {

		String sentence = "hello hello hi this is test message hi test this";
//		String sentence = "hello hello hello";
		
		String words[] = sentence.split("\\s");
		
		System.out.println("The words in the string are :");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		int count =0;
		HashMap<String,Integer> hm = new HashMap<>();
		for(String word : words) {
			
			if(hm.get(word)==null) {
				hm.put(word, 1);
				count++;
			}
		}
		System.out.println("The count of unique words is : "+count);
		
		
		System.out.println(hm.keySet().toString());
		
		/*
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			
			System.out.println("KEY : "+key+" VALUE : " + hm.get(key));
		}
		*/
	}

}
