package com.jar.implementation;

import java.util.Arrays;

public class AlphabeticalWordSentence {

	public static void main(String[] args) {
		String exmpl=new String("This is a sample piece of text to illustrate this problem");  
		System.out.println("original : "+exmpl);
		String parts[] = exmpl.split("\\s+"); //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		for(int i=0; i<parts.length;i++)
			System.out.println("Part "+i+": "+ parts[i]);
			
		Arrays.sort(parts);  // This sorts based on Ascii. A = 65, Z=90 < a=97, z=122
		for(int i=0; i<parts.length;i++)
			System.out.println("Part "+i+": "+ parts[i]);

		StringBuilder sb = new StringBuilder();  
		for(String s:parts){  
		   sb.append(s);  
		   sb.append(" ");  
		}  

		String sorted = sb.toString().trim(); 
		System.out.println("Sorted : "+ sorted);
	}

}
