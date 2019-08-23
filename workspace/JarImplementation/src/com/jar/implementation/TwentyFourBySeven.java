package com.jar.implementation;

import java.util.HashMap;
import java.util.Iterator;

public class TwentyFourBySeven {

	public static void main(String[] args) {
		// REVERSE THE WORDS IN THE SENTENCE
		
		String sentence = "Java Virtual Machine Learning Course";
		
		String words[] = sentence.split("\\s");
		
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
		}
		
		String output = "";
		
		for (int i = words.length -1; i >= 0 ; i--) {
			output = output+words[i]+" ";
		}
		
		System.out.println("\nThe reverse is : \n"+output);
				
		// REVERSE INDIVIDUAL WORDS IN THE SENTENCE
			
		String sentence2 = "The words will be reversed madam";
		
		String words2[] = sentence2.split("\\s");
		
		String outputSentence2 = "";
		for (int i = 0; i < words2.length; i++) {
			String temp = reverseString(words2[i]);
			outputSentence2 = outputSentence2 + temp + " ";
		}
		System.out.println("\nThe original sentence 2 is: \n"+ sentence2);
		System.out.println("\nThe reverse of individual words is: \n"+ outputSentence2);
		// COUNT OF EACH CHARACTER IN A STRING
		String x = "APPLE";
		char apple[] = x.toCharArray();
		HashMap<Character,Integer> hm1 = new HashMap<>();
		for (int i = 0; i < apple.length; i++) {
			if(hm1.get(apple[i]) != null )
				hm1.put(apple[i], hm1.get(apple[i]) +1 );
			else
				hm1.put(apple[i],1);
		}
		Iterator<Character> it = hm1.keySet().iterator();
		
		System.out.println("The count of each character is:");
		while(it.hasNext()){
			char temp = it.next();
			System.out.println(temp+" "+hm1.get(temp));
		}
		
		
		
		
		// COUNT OF EACH WORD IN A SENTENCE
		
		String sentence3 = "This This is is is is is is count test test test";
		String words_array[] = sentence3.split("\\s");
		
		System.out.println(sentence3);
		
		HashMap<String,Integer> hm3 = new HashMap<>();
		/*for (int i = 0; i < words3.length; i++) {
			
			if(hm3.get(words3[i]) != null )
				hm3.put(words3[i], hm3.get(words3[i])+ 1);
			else
				hm3.put(words3[i], 1);
		}*/
		
		for(String each_word: words_array){
			if( hm3.get(each_word) != null)
				hm3.put(each_word, hm3.get(each_word)+1);
			else
				hm3.put(each_word, 1);
		}
		
		
		System.out.println("The count of each word is:");
		Iterator<String> it3 = hm3.keySet().iterator();
		while(it3.hasNext())
		{
			String temp3 = it3.next();
			System.out.println(temp3+" "+ hm3.get(temp3));
		}
		
		
		
		
		
		
	}

	private static String reverseString(String input) {
		
		char arr[]=input.toCharArray();
		String output = "";
		for (int i =arr.length-1 ; i >=0 ; i--) {
			output=output+arr[i];
		}
		
		
		return output;
	}

}
