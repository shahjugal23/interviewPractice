package com.jar.implementation;

import java.util.LinkedList;
import java.util.Scanner;

public class AmazonSumofDigitsinString {

	public static void main(String[] args) {
		/*LinkedList<String> list = new LinkedList<>();
		list.add("Jugal");
		list.add("Shah");
		list.add(1,	 "Sudesh");
		System.out.println("LinkedList is : "+ list);*/

		
		/*Scanner sc = new Scanner("ab50dt60h4q");
        int sum = 0;
        sc.useDelimiter("\\D+");
        while(sc.hasNext()) {
            sum+=Integer.parseInt(sc.next());
        }
        System.out.println(sum);*/
        
        
        String s = "ab12dt18h40q5j";
        System.out.println("Length is  : "+ s.length());
        int len = s.length(); // 14
        int sum1=0;
        for(int i=0; i< len-1; i++){ // 0 -12
        	char a = s.charAt(i);
        	char b = s.charAt(i+1);
        	int c =0;

        	if(Character.isDigit(a)){
        		if(Character.isDigit(b)){
        		c = (Integer.parseInt(String.valueOf(a)) * 10) + Integer.parseInt(String.valueOf(b));
        		System.out.println("A&B -> C: "+ c);
        		i++;
        		}
        	
        	else {
        			 c = Integer.parseInt(String.valueOf(a));
        			 System.out.println("A -> C: "+ c);
        		}
        		sum1 += c;
        	}
        }
        System.out.println("the sume is :"+ sum1);
        }
	}
