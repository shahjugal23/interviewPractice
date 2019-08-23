package com.jar.implementation;

import java.util.Arrays;

public class WordCountNutanix {

	public static void main(String[] args) {
		String sentence = "hello hello hi this is test message hi";
		
		String words[] = sentence.split("\\s");
		
		Arrays.sort(words);
		
		System.out.println("The words array is : ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		int count=1;
		for(int i =0; i<words.length-1;){
			for(int j =i+1;j<words.length;j++){
				if( !words[i].equals(words[j] )){
					count++;
					i=j;
					break;
				}
			}
		}
		
		System.out.println("The number of words in the sentence are: "+count);
	
	}
}
