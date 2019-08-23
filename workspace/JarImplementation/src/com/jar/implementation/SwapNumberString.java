package com.jar.implementation;

public class SwapNumberString {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		System.out.println("A: "+a+" B: "+b);
		a = a+b; // 30
		b = a-b; // 30-20 = 10
		a = a-b;
		System.out.println("A: "+a+" B: "+b);
		
		
		String s1 = "First";
		String s2 = "Second";
		System.out.println("S1: "+s1+" S2: "+s2);
		s1 = s1+s2; // FIRSTSECOND
		s2 = s1.substring(0, (s1.length() - s2.length())); // 0 - 4. 5th element is not considered
		s1 = s1.substring(s2.length());
		System.out.println("S1: "+s1+" S2: "+s2);
		
		
		String str1 = "one", str2 ="two",str3="";
		str3 = str1;
		str1= str2;
		str2= str3;
		System.out.println("String 1: "+str1+"  String 2: "+str2);
	}

}
