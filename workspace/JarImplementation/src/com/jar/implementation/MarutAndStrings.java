package com.jar.implementation;

import java.util.Scanner;

public class MarutAndStrings {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number of strings you want to test.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		for(int i=1;i<=n;i++)
		{
			
			System.out.println("Enter String "+i+" : ");
			String s = scan1.nextLine();
			System.out.println("The entered string is : "+s);
			int is_marut = CheckIsMarut(s);
			System.out.println("The validation is : "+ is_marut);
		}
	}

	private static int CheckIsMarut(String s) {
		char a[] = s.toCharArray();
		int len = a.length;
		int lower = 0, upper = 0, other = 0;
		for(int j=0; j<len; j++){
			if(is_lower(a[j]))
				lower++;
			else if(is_upper(a[j]))
				upper++;
			else
				other++;
		}
		if(len == other)
			return -1;
		else
			return (upper>lower) ? lower : upper;
	}

	private static boolean is_upper(char c) {
		return (c>=65 && c<=90);

	}

	private static boolean is_lower(char c) {
		return (c>=97 && c<=122);
	}

}
